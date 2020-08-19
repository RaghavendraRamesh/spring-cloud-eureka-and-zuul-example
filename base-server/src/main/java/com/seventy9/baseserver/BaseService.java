package com.seventy9.baseserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseService {
    @GetMapping("/sayhello")
    public String sayHello(){
        return "Hello";
    }
}
