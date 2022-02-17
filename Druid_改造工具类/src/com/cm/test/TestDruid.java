package com.cm.test;

import com.cm.utils.JDBCUtils;
import java.sql.Connection;
import java.sql.SQLException;

public class TestDruid {
    public static void main(String[] args) {
        try {
            Connection connection = JDBCUtils.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
