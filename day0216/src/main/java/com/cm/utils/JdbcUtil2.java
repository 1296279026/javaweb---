package com.cm.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JdbcUtil2 {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;


    static {

        try {

            InputStream is = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(is);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
