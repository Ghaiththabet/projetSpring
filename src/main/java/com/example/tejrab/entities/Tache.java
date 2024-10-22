package com.example.tejrab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tache")

public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTache")
    private long idTache ;
    private LocalDate dateTache ;
    private Integer duree ;
    private Float tarifHoraire ;
    @Enumerated(EnumType.STRING)
    private TypeTache typeTache ;

    @ManyToOne
    Etudiant etudiant ;

}
