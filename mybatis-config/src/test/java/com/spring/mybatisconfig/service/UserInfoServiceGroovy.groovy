package com.spring.mybatisconfig.service

import com.spring.mybatisconfig.mapper.UserInfoMapper
import spock.lang.Specification

class UserInfoServiceGroovy extends Specification{

    UserInfoService userInfoService

    UserInfoMapper userInfoMapper = Mock(UserInfoMapper)

    void setup(){
        userInfoService = new UserInfoService(
                userInfoMapper: userInfoMapper
        )
    }

    def "getUser"(){
        given:
            def userName = "zhangsan"
            def result = ""
        when:
            result = userInfoService.getUserInfoByUserName(userName)
        then:
            noExceptionThrown()
            result != null
    }
}
