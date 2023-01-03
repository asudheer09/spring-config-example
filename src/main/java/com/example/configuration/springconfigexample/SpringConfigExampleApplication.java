package com.example.configuration.springconfigexample;

import com.example.configuration.springconfigexample.product.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConfigExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(SpringConfigExampleApplication.class, args);
		/*DemoManager manager=(DemoManager) context.getBean("getDemoManager");
		String result=manager.getServiceName();
		System.out.println("output : "+result);*/

		//type cast
		/*int a=10;
		float b=a;
		int c= (int) b;*/

		ProductServiceImpl productService=context.getBean(ProductServiceImpl.class);
		productService.displayProduct();

	}

}
