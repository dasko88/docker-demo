package it.david.rd.dockerdemoserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from DemoController "+new Date();
    }
}
