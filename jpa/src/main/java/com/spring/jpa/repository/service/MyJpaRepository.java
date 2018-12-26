package com.spring.jpa.repository.service;

import com.spring.jpa.repository.mapper.UserInfoMapper;
import com.spring.jpa.repository.model.UserInfo;

import java.util.List;

public interface MyJpaRepository {
    public List<UserInfo> getUserInfoByEveryOne(com.spring.jpa.model.UserInfo userInfo);
}
