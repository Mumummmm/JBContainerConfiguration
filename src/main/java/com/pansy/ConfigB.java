package com.pansy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {

    @Bean
    public Foo2 foo2() {
        return new Foo2();
    }
}
