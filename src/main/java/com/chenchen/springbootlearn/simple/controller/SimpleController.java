package com.chenchen.springbootlearn.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {
    private class Hello {

        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public Hello sayHello() {
        Hello h =new Hello();
        h.setMessage("hello world");
        return h;
    }

}
