package com.spring.jpa.web;

import com.alibaba.fastjson.JSON;
import com.spring.jpa.model.UserInfo;
import com.spring.jpa.repository.UserInfoRepository;
import com.spring.jpa.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserInfoRepository userInfoRepository;

    @PostMapping("/getUserInfo")
    public String getUserInfo(@RequestBody(required = false) UserInfo userInfo){
        return JSON.toJSONString(userInfoService.getUserInfo(userInfo));
    }

//    @GetMapping("/show/{userName}/{pwd}")
//    public String showUserInfo(@PathVariable("userName") String userName,@PathVariable("pwd") String pwd){
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserName(userName);
//        userInfo.setPwd(pwd);
//        return JSON.toJSONString(userInfoService.showUserInfo(userInfo));
//    }

    @Cacheable(value = "userInfo",key = "#id")
    @GetMapping("/getUser/{id}")
    public Object getUser(@PathVariable("id") long id){
        log.info("user信息id：{}",id);
        return userInfoRepository.findById(id);
    }

//    @CachePut(value="userInfo",key = "#userInfo.id")
    @PostMapping("/update")
    public Object updateUser(@RequestBody UserInfo userInfo){
        userInfoRepository.save(userInfo);
        return "success";
    }
}
