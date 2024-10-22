package com.example.tejrab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @Column(name="idReservation")
    private String idReservation ;
    private Date anneeUniversitaire ;
    private boolean estValide ;

    @ManyToOne
    private Chambre chambre; // a verifier

@ManyToMany(mappedBy ="reservations")
private Set<Etudiant> etudiants ;

@PrePersist
    public void prePersist() {
        if (idReservation == null) {
            idReservation = UUID.randomUUID().toString();
        }
    }
}
