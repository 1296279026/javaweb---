package com.cm.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {
    public static DruidDataSource druidDataSource = null;

    static {
        druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///product?useSSL=false");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("1234");


    }

    public static Connection getConnection() throws SQLException {

        DruidPooledConnection connection = druidDataSource.getConnection();
        return connection;

    }
    public static DruidDataSource getDruidDataSource(){
        return druidDataSource;
    }
}
