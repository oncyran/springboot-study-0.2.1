package org.newit.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProfileTestController {

    @Value("${org.newit.printMessage}")
    public String profileMessage;

    @ResponseBody
    @RequestMapping("/printProfileMessage")
    public String printProfileMessage(){
        return profileMessage;
    }

}
