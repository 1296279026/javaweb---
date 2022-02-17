package com.cm.service;

import com.cm.dao.ProductDao;
import com.cm.dao.ProductDaoImpl;
import com.cm.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDao productDao = new ProductDaoImpl();
        List<Product> products = productDao.show();
        for (Product p : products) {
            //把数据存进去
            req.setAttribute("productList", products);
        }
        //转发
        req.getRequestDispatcher("/product.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
