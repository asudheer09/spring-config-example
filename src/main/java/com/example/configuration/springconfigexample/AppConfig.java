package com.example.configuration.springconfigexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="getDemoManager")
    public  DemoManager getDemoManager(){
        return new DemoManagerImpl();
    }

}
