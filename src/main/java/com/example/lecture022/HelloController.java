package com.example.lecture022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello World";
    }
    
    @GetMapping("foo")
    public String foo() {
        return "Foo";
    }
    
    @GetMapping("bar")
    public String bar() {
        return "Bar";
    }
}
