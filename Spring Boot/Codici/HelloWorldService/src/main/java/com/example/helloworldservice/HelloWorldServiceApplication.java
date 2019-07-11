package com.example.helloworldservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *  SpringBootApplication:
 */
@SpringBootApplication
public class HelloWorldServiceApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(HelloWorldService.class, args);

        InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("InjectedByConstructorService");
    }
}
