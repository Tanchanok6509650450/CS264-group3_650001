package com.tu.ac.th.services.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.tu.ac.th.services.Models.Auth;
import com.tu.ac.th.services.Repository.AuthRepository;

@RestController

public class AuthController {
    
    @Autowired
    AuthRepository authRepository;
    
    //will be called every time the page sends or recieve data
    @PostMapping("/api/saveAuth")
    public int saveAuth(@RequestBody String authJsonString){
        try{
            Auth AuthObj = new Auth(authJsonString);
            authRepository.save(AuthObj);
            return 0;
        }catch(Exception e){
            return 1;
        }
    }
}