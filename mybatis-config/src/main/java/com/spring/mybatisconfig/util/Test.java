package com.spring.mybatisconfig.util;

import com.spring.mybatisconfig.dto.UserInfoExample;
import org.springframework.cglib.beans.BeanMap;

import java.util.Map;

public class Test {
    public static void main(String args[]){
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUsernameEqualTo("zhangsan");
        userInfoExample.setDistinct(true);
    }
}
