package com.spring.mybatisconfig.mapper;

import com.spring.mybatisconfig.dto.UserInfo;
import com.spring.mybatisconfig.dto.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}