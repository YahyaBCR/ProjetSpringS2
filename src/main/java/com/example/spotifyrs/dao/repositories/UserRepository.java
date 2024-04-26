package com.example.spotifyrs.dao.repositories;

import com.example.spotifyrs.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
