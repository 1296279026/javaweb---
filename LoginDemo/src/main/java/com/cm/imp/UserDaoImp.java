package com.cm.imp;

import com.cm.dao.UserDao;
import com.cm.entity.User;
import com.cm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImp implements UserDao {

    @Override
    public User chekLogin(String username, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = new User();
        try {
            conn = JdbcUtil.getConnection();
            String sql = "select * from tb_user where username='" + username + "' and password='" + password + "'";
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                JdbcUtil.close(conn, ps, rs);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return user;
    }
}
