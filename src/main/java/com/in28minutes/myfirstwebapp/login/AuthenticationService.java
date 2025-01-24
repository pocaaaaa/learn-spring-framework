package com.in28minutes.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        //equalsIgnoreCase() : 대소문자 구분없이 비교
        //equals() : 대소문자 구분하여 비교
        boolean isValidUserName = username.equalsIgnoreCase("in28minutes");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return isValidUserName && isValidPassword;
    }
}
