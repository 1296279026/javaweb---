package com.cm.dao;

import com.cm.entity.Product;
import com.cm.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    //查询商品
    @Override
    public List<Product> show() {
        //创建queryRunner  查询对象(数据库连接)
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDruidDataSource());

        String sql = "select * from product ";

        List<Product> productList = null;
        try {

            productList = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
