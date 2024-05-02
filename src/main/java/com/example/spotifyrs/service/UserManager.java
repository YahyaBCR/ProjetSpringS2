package com.example.spotifyrs.service;


import com.example.spotifyrs.dao.entities.Ruser;

public interface UserManager {
    public Ruser addUser(Ruser ruser);
    public Ruser getUsersById(Integer id);
    public boolean authenticate(String email, String password);
}