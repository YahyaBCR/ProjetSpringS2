package com.example.spotifyrs.dao.repositories;


import com.example.spotifyrs.dao.entities.Ruser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Ruser, Integer> {
    Ruser findByEmailAndAndPassword(String email, String password);

}


