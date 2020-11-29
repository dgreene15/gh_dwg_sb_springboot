package com.dwg.springbootweb.controller;

import com.dwg.springbootweb.domain.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    private static final String template = "Hello, %s!";

    @Value("${spring.application.name}")
    private String appname;

    @GetMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        name += " (" + appname + ")";

        Greeting greet = new Greeting(String.format(template, name));
        return greet;
    }
}
