package com.shepa.lesson1.servlet;

import com.shepa.lesson1.goods.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ProductsServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(ProductsServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Products GET Request");

        resp.getWriter().println(new Product(0, "Apple", 80.5F));
        resp.getWriter().println(new Product(1, "Bananas", 90.0F));
        resp.getWriter().println(new Product(2, "Watermelon", 19.3F));
        resp.getWriter().println(new Product(3, "Milk", 50.0F));
        resp.getWriter().println(new Product(4, "Coffee", 500.0F));
        resp.getWriter().println(new Product(5, "Tea", 100.5F));
        resp.getWriter().println(new Product(6, "Chocolate", 70.35F));
        resp.getWriter().println(new Product(7, "Eggs", 80.0F));
        resp.getWriter().println(new Product(8, "Ice cream", 50.F));
        resp.getWriter().println(new Product(9, "Cake", 150.0F));

    }

    @Override
    public void init() throws ServletException {
        logger.info("init");
    }

    @Override
    public void destroy() {
        logger.info("destroy");
    }

}
