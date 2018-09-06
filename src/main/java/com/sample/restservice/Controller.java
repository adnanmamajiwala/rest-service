package com.sample.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-service")
public class Controller {

    @GetMapping(value = "/hello")
    public String getValue(){
        return "HelloWorld";
    }

}
