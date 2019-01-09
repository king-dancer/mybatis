package com.spring.activiti.service;

import com.github.pagehelper.PageHelper;
import com.spring.activiti.dto.UserInfo;
import com.spring.activiti.dto.UserInfoExample;
import com.spring.activiti.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    public List<UserInfo> getUserInfo(){
//        UserInfoExample userInfoExample = new UserInfoExample();
//        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        PageHelper.startPage(1,2);
        return userInfoMapper.selectByExample(null);
    }
}
