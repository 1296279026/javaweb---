package com.cm.test;

import com.cm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Cm {
    public static void main(String[] args) {
        try {
            Connection connection = JdbcUtil.getConnection();
            System.out.println(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
