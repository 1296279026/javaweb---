package com.cm.test;

import com.cm.entity.Product;
import com.cm.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //创建queryRunner  查询对象(数据库连接)
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDruidDataSource());

        String sql = "select * from product ";

        List<Product> productList = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));

        if (productList != null && productList.size() > 0) {

            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
    @Test
    //添加
    public void Test1() throws SQLException {

        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDruidDataSource());

        String sql="INSERT INTO product VALUES(?,?,?,?,?);";

        Object[]cs={9,"拯救者",3.2,"images/6.jpg","好"};

        int i = queryRunner.update(sql,cs);

        System.out.println("添加成功"+i);

    }

    @Test
    //删除
    public void Test2() throws SQLException {

        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDruidDataSource());

        String sql="delete from product where id=?";

        //Object[]cs={6,"拯救者",3.2,"images/6.jpg","好"};

        int i = queryRunner.update(sql,6);

        System.out.println("删除成功"+i);

    }

    @Test
    //查询总条数
    public void Test3() throws SQLException {

        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDruidDataSource());

        String sql="select count (id) from product";


        Long obj = (Long) queryRunner.query(sql,new ScalarHandler());

        int i = obj.intValue();

        System.out.println(i);


    }


}
