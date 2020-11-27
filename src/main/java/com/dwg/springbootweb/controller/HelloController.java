package com.dwg.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    //@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String sayHello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        System.out.println("in sayHello controller2");
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
}
