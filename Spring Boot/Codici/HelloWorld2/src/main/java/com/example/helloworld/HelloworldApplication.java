package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *  SpringBootApplication:
 */
@SpringBootApplication
public class HelloworldApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(HelloworldApplication.class, args);

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.sayHello();
    }
}
