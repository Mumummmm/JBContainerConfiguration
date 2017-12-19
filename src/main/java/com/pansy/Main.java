package com.pansy;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.scan("com.pansy");
//        ctx.refresh();
//        MyService myService = ctx.getBean(MyService.class);

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        Foo f1 = ctx.getBean(Foo.class);
//        Foo2 f2 = ctx.getBean(Foo2.class);

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemTestConfig.class);
//        TransferService transferService = ctx.getBean(TransferService.class);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
        TransferService transferService = ctx.getBean(TransferService.class);
    }
}
