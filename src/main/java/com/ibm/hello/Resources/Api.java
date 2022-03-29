package com.ibm.hello.Resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/v1")
public class Api {
    @GetMapping("/Saldo")
    public String Hello(){
        return "Greetings from Spring Boot!";
    }
}
