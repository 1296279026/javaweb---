package com.cm.com.cm.test;

import com.cm.dao.ProductDao;
import com.cm.dao.ProductDaoImpl;
import com.cm.entity.Product;

import java.util.List;

public class TestPro {
    public static void main(String[] args) {
        ProductDao productDao=new ProductDaoImpl();
        List<Product> products = productDao.show();



    }
}
