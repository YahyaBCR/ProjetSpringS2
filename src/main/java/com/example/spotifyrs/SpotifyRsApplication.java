package com.example.spotifyrs;

import com.example.spotifyrs.dao.entities.User;
import com.example.spotifyrs.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan("com.example.spotifyrs.dao.entities")
@EnableWebMvc
public class SpotifyRsApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpotifyRsApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception{

    }

}
