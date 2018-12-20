package com.spring.mybatisconfig.util;

import com.spring.mybatisconfig.dto.UserInfo;
import javafx.scene.shape.VLineTo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LambdaTest {
    static String message="";
    public static void main(String args[]){
//        String[] strArr = {"one","three","two","four","five","six"};
//        List<String> list = Arrays.asList(strArr);
//        list.forEach(str->{
//            if("six".equals(str)){
//                System.out.println("666666");
//                message=str;
//            }
//        });
//        System.out.print(message);
        List<UserInfo> userInfoList = new ArrayList<UserInfo>(){
            {
                add(new UserInfo(1L, "zhangsan", "zs123456", "13569874587", "zs@qq.com", "张三"));
                add(new UserInfo(2L, "lisi", "ls123456", "13569874588", "ls@qq.com", "李四"));
                add(new UserInfo(3L, "wanger", "we123456", "13569874589", "we@qq.com", "王二"));
                add(new UserInfo(4L, "tom", "t123456", "13569874597", "tom@qq.com", "汤姆"));
            }
        };
        //stream函数 为集合创建串行流（懒处理） filter函数 过滤数据   map函数 主要用来对传入得参数做逻辑处理    ::类似C++域运算符 通过类名调用方法
        // collect函数 集合成所需要的集合类型
        List str = userInfoList.stream().filter(userInfo->userInfo.getId()>2).map(UserInfo::getEmail).collect(toList());
        str.stream().forEach(System.out::println);
        String messages = "尊敬的客户#name#，您的贷款审批通过！";
        test(messages);
    }

    public static void test(String messages){
        String[] mess = new String[]{messages};
        Map<String,String> map = new HashMap<>();
        map.put("name","张三");
        map.forEach((key,value)->{
            if(mess[0].contains(key)){
                mess[0]=mess[0].replaceAll("#"+key+"#",value);
            }
        });
        System.out.println(mess[0]);
    }
}
class Message{
    String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}