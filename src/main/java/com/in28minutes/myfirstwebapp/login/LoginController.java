package com.in28minutes.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String gotoLoginPage() {
        return "login";
    }

    //@RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model)
    {
        model.put("name", name);
        logger.debug("Request param is {}", name);
        logger.info("I want this printed at info level");
        logger.warn("I want this printed at warn level");
        System.out.println("Request Param is "+name); // NOT RECOMMENDED FOR PROD CODE
        return "login";
    }
}
