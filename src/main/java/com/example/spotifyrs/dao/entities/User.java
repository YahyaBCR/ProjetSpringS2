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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
    String Nom;
    String Prenom;
    String Username;
    String Email;
    String Password;

    public User(String nom, String prenom, String username, String email, String password) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.Username = username;
        this.Email = email;
        this.Password = password;
    }

    
}
