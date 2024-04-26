package com.example.spotifyrs.dao.entities;



import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

@Data
@Entity
@Getter
@Setter
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



}
