package com.spring.mybatisconfig.mapper;

import com.spring.mybatisconfig.dto.UserInfo;
import com.spring.mybatisconfig.dto.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);
}