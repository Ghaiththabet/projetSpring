package com.example.tejrab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="Etudiant")

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt ;
    private Long cin; // Clé primaire
    private String ecole ;
    private Date dateNaissance ;

    @ManyToMany
    private Set<Reservation> reservations ;

    @OneToMany(mappedBy = "etudiant")
    private Set<Tache> taches ;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}
