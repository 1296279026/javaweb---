package com.cm.web;

import com.cm.dao.UserDao;
import com.cm.entity.User;
import com.cm.imp.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserDao userdao=new UserDaoImp();
        User user= userdao.chekLogin(username,password);
        if (user!=null&&user.getUsername()!=null){
            System.out.println("登录成功");

        }else {
            System.out.println("登录失败");
        }
    }
}
