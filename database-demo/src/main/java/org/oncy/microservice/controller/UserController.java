package org.oncy.microservice.controller;

import org.oncy.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/insertUser")
    public int insertUser(@RequestParam String name, @RequestParam int age) {
        return userService.insertUser(name, age);
    }
}
