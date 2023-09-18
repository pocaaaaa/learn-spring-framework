package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWordSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context
        var context =
                new AnnotationConfigApplicationContext(HelloWordConfiguration.class);

        // 2: Configure the things that we want Spring to manage - @Configuration
        // HelloWorldConfiguration
        // name - @Bean

        // 3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
        //System.out.println(context.getBean(Address.class));
    }
}
