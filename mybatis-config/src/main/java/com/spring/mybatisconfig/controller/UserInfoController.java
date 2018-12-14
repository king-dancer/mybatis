package com.spring.mybatisconfig.controller;

import com.alibaba.fastjson.JSON;
import com.spring.mybatisconfig.dto.UserInfo;
import com.spring.mybatisconfig.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/getUserInfoByUserName/{userName}")
    public String getUserInfoByUserName(@PathVariable("userName") String userName){
        List<UserInfo> userInfoList = userInfoService.getUserInfoByUserName(userName);
        return JSON.toJSONString(userInfoList);
    }
}
