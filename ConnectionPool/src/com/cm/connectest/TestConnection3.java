package com.cm.connectest;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;

public class TestConnection3 {
    public static void main(String[] args) throws Exception {

        DruidDataSource druidDataSource=new DruidDataSource();

        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///product");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("1234");

        DruidPooledConnection druidPooledConnection = druidDataSource.getConnection();

        Connection connection = druidPooledConnection.getConnection();
        System.out.println(connection);
    }
}
