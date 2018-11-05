package com.mrle.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String hi() {

        System.out.println(foo);

        return foo;
    }
}
