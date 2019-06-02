package org.newit.microservice;

import org.newit.springboot.starter.TimeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class MainController {

    @Autowired
    private UserModel user;
    @Value("${newit.name}")
    private String userName;
    @Autowired
    private TimeProvider timeProvider;

    @ResponseBody
    @RequestMapping("/takeTime")
    public Date takeTime(){
        return timeProvider.provideTime();
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public UserModel getUser(){
        return user;
    }
    @RequestMapping("/getUserName")
    @ResponseBody
    public String getUserName(){
        return userName;
    }

    //old code
    @RequestMapping("/start")
    @ResponseBody
    public String start(){
        return "start";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/gogogo")
    @ResponseBody
    public Object gogogo(){
        Map<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("hey", "man");
        return objectMap;
    }



    public static void main(String[] args) {
        SpringApplication.run(MainController.class);

    }
}
