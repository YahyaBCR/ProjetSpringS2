package com.example.spotifyrs.dao.repositories;


import com.example.spotifyrs.dao.entities.Ruser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Ruser, Integer> {

}
