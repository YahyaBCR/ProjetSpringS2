package com.example.spotifyrs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }


    @GetMapping("login")
    public String viewLoginForm(){
        return "testtt";




    }



}
