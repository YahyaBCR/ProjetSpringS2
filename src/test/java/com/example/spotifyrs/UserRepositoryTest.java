package com.example.spotifyrs;

import com.example.spotifyrs.dao.entities.User;
import com.example.spotifyrs.dao.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("yahyabcr@gmail.com");
        user.setPassword("yahya");
        user.setNom("bcr");
        user.setPrenom("yahya");

        User savedUser = repo.save(user);
        User existUSer = entityManager.find(User.class, savedUser.getId());

        assertThat(existUSer.getEmail()).isEqualTo(user.getEmail());
    }
}
