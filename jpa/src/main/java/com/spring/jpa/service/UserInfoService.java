package com.spring.jpa.service;

import com.spring.jpa.model.UserInfo;
import com.spring.jpa.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    public List<com.spring.jpa.repository.model.UserInfo> getUserInfo(UserInfo userInfo){
        return userInfoRepository.getUserInfoByEveryOne(userInfo);
    }

}
