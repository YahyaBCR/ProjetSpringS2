package com.example.spotifyrs.dao.repositories;


import com.example.spotifyrs.dao.entities.Ruser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Ruser, Integer> {

}
