package com.cm.test;

import com.alibaba.fastjson.JSON;
import com.cm.entity.User;
import org.testng.annotations.Test;

public class TestDemo2 {
    @Test
    public void fun(){

        User user=new User();
        user.setId(1);
        user.setUsername("钟离");
        user.setPassword("123123");
        user.setAddress("璃月");

        String jsonString = JSON.toJSONString(user);
        System.out.println(user);


    }
}
