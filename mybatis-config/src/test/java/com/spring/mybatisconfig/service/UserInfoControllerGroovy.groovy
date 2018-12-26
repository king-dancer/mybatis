package com.spring.mybatisconfig.service

import com.spring.mybatisconfig.controller.UserInfoController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class UserInfoControllerGroovy extends Specification{
    @Autowired(required = false)
    private UserInfoController userInfoController;

    def "getUserInfoByUserName"(){
       given:
        def str=""
       when:
        str = userInfoController.getUserInfoByUserName("zhangsan")
       then:
        noExceptionThrown()
        str == "[{\"email\":\"zhangs@163.com\",\"id\":1,\"mobile\":\"13243531367\",\"name\":\"张三\",\"pwd\":\"zs123456\",\"username\":\"zhangsan\"}]"
        System.out.print(str)
    }
}
