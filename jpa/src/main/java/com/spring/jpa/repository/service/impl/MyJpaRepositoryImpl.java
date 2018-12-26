package com.spring.jpa.repository.service.impl;

import com.spring.jpa.repository.mapper.UserInfoMapper;
import com.spring.jpa.repository.model.UserInfo;
import com.spring.jpa.repository.model.UserInfoExample;
import com.spring.jpa.repository.service.MyJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MyJpaRepositoryImpl implements MyJpaRepository {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoByEveryOne(com.spring.jpa.model.UserInfo userInfo){
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        if(!StringUtils.isEmpty(userInfo)){
            if(!StringUtils.isEmpty(userInfo.getId())){
                criteria.andIdEqualTo(userInfo.getId());
            }
            if(!StringUtils.isEmpty(userInfo.getUserName())){
                criteria.andUsernameEqualTo(userInfo.getUserName());
            }
            if(!StringUtils.isEmpty(userInfo.getPwd())){
                criteria.andPwdEqualTo(userInfo.getPwd());
            }
            if(!StringUtils.isEmpty(userInfo.getMobile())){
                criteria.andMobileEqualTo(userInfo.getMobile());
            }
            if(!StringUtils.isEmpty(userInfo.getEmail())){
                criteria.andEmailEqualTo(userInfo.getEmail());
            }
            if(!StringUtils.isEmpty(userInfo.getName())){
                criteria.andNameEqualTo(userInfo.getName());
            }
        }
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        return userInfoList;
    }
}
