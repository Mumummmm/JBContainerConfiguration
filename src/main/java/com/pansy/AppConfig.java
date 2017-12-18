package com.pansy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pansy")
public class AppConfig {

    @Bean("myService")
    public MyService myService() {
        return new MyServiceImpl();
    }
}
