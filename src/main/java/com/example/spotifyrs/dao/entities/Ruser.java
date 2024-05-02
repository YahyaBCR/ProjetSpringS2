package com.example.spotifyrs.dao.entities;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ruser")
public class Ruser {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer id;

    @Column(name = "nom")
    String nom;

    @Column(name = "prenom")
    String prenom;

    @Column(name = "username")
    String username;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;


    public Ruser(String nom, String prenom, String username, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
