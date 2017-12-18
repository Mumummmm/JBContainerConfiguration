package com.pansy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        MyService myService = ctx.getBean(MyService.class);
//        myService.doStuff();

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(AppConfig.class);
//        ctx.register(AdditionalConfig.class);
//        ctx.refresh();
//        MyService myService = ctx.getBean(MyService.class);
//        myService.doStuff();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.pansy");
        ctx.refresh();
        MyService myService = ctx.getBean(MyService.class);
    }
}
