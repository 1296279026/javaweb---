package com.cm.checkcode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收前端参数
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String val=req.getParameter("val");
        //
        HttpSession session=req.getSession();

       String randomCode = (String) session.getAttribute("randomCode");

       if (!val.equalsIgnoreCase(randomCode)){
          req.setAttribute("error","验证码错误");
          req.getRequestDispatcher("/login.jsp").forward(req,resp);
       }else {
           System.out.println("正确");
       }



    }
}
