package com.example.demo;

import com.example.demo.model.ExampleData;
import com.example.demo.util.XinBaoUtil;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;

@RestController
public class HelloController {

    @RequestMapping("/msg")
    public ExampleData msg() {
        ExampleData hello = ExampleData.builder().msg("hello").build();
        new XinBaoUtil().test(hello);
        return hello;
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! V4";
    }
}