package com.example.esercitazionespringboot.helloworld.services;


import org.springframework.stereotype.Service;

/**
 * Created by jt on 10/26/15.
 */
@Service
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}
