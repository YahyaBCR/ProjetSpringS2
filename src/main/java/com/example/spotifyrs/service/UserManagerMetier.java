package com.example.spotifyrs.service;

import com.example.spotifyrs.dao.entities.Ruser;
import com.example.spotifyrs.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerMetier implements UserManager{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Ruser addUser(Ruser user){
       return userRepository.save(user);
    }

    @Override
    public Ruser getUsersById(Integer id){
        return userRepository.findById(id).get();
    }

//    @Override
//    public Ruser getRuserByEmailPassword(String email,String password){
//        //return userRepository.findBy(email,password);
//        return
//    }

}