package com.example.helloworld;

import org.springframework.stereotype.Component;

/**
 * Component: la seguente classe viene registrata come Java Bean
 */
@Component
public class HelloWorld {
    public void sayHello(){
        System.out.println("Hello world!");
    }
}
