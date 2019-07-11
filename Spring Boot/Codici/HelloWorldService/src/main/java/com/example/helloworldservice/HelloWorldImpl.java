package com.example.helloworldservice;

import org.springframework.stereotype.Component;

/**
 * Component: la seguente classe viene registrata come Java Bean
 */
@Component
public class HelloWorldImpl implements HelloWorldService{
    public void sayHello(){
        System.out.println("Hello world!");
    }
}
