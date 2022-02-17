package com.cm.web;

import com.cm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        System.out.println(connection);
    }
}
