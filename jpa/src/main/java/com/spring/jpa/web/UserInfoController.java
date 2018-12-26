package com.spring.jpa.web;

import com.alibaba.fastjson.JSON;
import com.spring.jpa.model.UserInfo;
import com.spring.jpa.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/getUserInfo")
    public String getUserInfo(@RequestBody(required = false) UserInfo userInfo){
        return JSON.toJSONString(userInfoService.getUserInfo(userInfo));
    }
}
