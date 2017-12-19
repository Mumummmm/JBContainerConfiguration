package com.pansy;

import org.springframework.context.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
@ComponentScan(basePackages = "com.pansy")
public class AppConfig {

    @Bean("myService")
    public MyService myService() {
        return new MyServiceImpl();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy", name = "myFoo")
    public Foo foo() {
        return new Foo();
    }

    @Bean(name = {"myAnotherFoo", "Foo2"})
    @Description("Provides a basic example of a bean")
    @Scope("prototype")
    public Foo foo2() {
        Foo foo = new Foo();
        foo.init();
        return foo;
    }

    @Bean
    @SessionScope
    public UserPreferences userPreferences() {
        return new UserPreferences();
    }

    @Bean
    public Service userService() {
        UserService service = new UserServiceImpl();
        service.setUserPreferences(userPreferences());
        return service;
    }
}
