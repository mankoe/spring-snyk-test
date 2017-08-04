package com.makoebi.springsnyktest.com.mankoebi.springsnyktest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String helloWorld() {
        return "Hello World";
    }

}
