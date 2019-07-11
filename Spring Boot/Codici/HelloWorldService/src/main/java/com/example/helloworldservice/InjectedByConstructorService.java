package com.example.helloworldservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
    private HelloWorldService helloWorldService;

    /**
     * @Autowired: indica a Spring che per questa classe
     * deve essere creato automaticamente
     * un bean helloWorldService
     * @param helloWorldService
     */
    @Autowired
    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    }
}
