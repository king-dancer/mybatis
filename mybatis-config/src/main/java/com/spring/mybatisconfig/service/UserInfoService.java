package com.spring.mybatisconfig.service;

import com.spring.mybatisconfig.dto.UserInfo;
import com.spring.mybatisconfig.dto.UserInfoExample;
import com.spring.mybatisconfig.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoByUserName(String userName){
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        return userInfoMapper.selectByExample(userInfoExample);
    }

    public List<UserInfo> page(){
        return userInfoMapper.selectByExample(null);
    }
}
