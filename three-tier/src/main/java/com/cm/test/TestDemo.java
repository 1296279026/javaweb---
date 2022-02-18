package com.cm.test;

import com.cm.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo {

    @Test
    public void fun() throws JsonProcessingException {

        User user=new User();
        user.setId(1);
        user.setUsername("钟离");
        user.setPassword("123123");
        user.setAddress("璃月");

        ObjectMapper objectMapper=new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);


    }

    @Test
    public void fun4() throws JsonProcessingException {
        String json_str="{\"id\":1,\"username\":\"钟离\",\"password\":\"123123\",\"address\":\"璃月\"}";
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.readValue(json_str, User.class);
//        System.out.println(user);
    }
    @Test
    public void fun2() throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        List<User> users=new ArrayList<User>();
        users.add(new User(001,"钟离","123","璃月"));
        users.add(new User(002,"迪卢克","123","蒙德"));
        users.add(new User(003,"达达利亚","123","至冬女王"));
        users.add(new User(004,"枫原万叶","123","稻妻"));

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("users",users);
        String s = objectMapper.writeValueAsString(map);
        System.out.println(s);

    }
}
