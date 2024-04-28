package com.example.spotifyrs.web;

import com.example.spotifyrs.dao.entities.Ruser;
import com.example.spotifyrs.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    private UserManager userManager;

    @GetMapping("")
    public String start(){
        return "index";
    }


    @GetMapping("yahya")
    public String viewLoginForm(){
        return "testtt";
    }




    @PostMapping("/LoginPosttest")
    public String ajouterProduit(Model model,
                                 @RequestParam(name = "email") String email,
                                 @RequestParam(name = "password") String password) {

        String nom = "omar";
        String prenom = "kabous";
        String username = "casper";

        System.out.println(nom+" || "+email+ " || " + password);

        Ruser user = new Ruser(nom,prenom,username,email,password);

        userManager.addUser(user);
        System.out.println(user.toString());
        return "testtt";
    }

}
