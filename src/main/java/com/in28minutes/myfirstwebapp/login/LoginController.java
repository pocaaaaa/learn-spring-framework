package com.in28minutes.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    //login?name=Ranga RequestParam
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            //Authenication
            //name - in28minuted
            //password - dummy
            return "welcome";
        }

        model.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }

    //@RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("Request param is {}", name);
        logger.info("I want this printed at info level");
        logger.warn("I want this printed at warn level");
        System.out.println("Request Param is " + name); // NOT RECOMMENDED FOR PROD CODE
        return "login";
    }
}
