package com.example.configuration.springconfigexample.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements  ProductService{

    @Autowired
    private Product product;

    @Override
    public void displayProduct() {
        System.out.println("product ServiceImpl");
        System.out.println(product);
    }
}
