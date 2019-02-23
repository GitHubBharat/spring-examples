package com.javadeveloperzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 19-07-2017.
 */
@RestController
public class SpringBootExampleController {

    @RequestMapping("")
    public String hello() {
        return "Spring boot PID writer example using ApplicationPidFileWriter";
    }
}
