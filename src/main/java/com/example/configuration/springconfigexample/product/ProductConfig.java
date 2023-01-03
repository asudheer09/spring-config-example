package com.example.configuration.springconfigexample.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean
    public Product getProduct(){
        Product product= new Product();
        product.setProductId(134);
        product.setProductName("Apple");
        product.setProductPrice(123456.786);
        return product;
    }


}
