package com.example.tejrab.entities;

import jakarta.persistence.*;

import java.util.Set;
import lombok.*;
@Setter
@Getter
@Data // Génère automatiquement les getters, setters, toString, equals et hashCode
@AllArgsConstructor // Génère un constructeur avec tous les champs
@NoArgsConstructor // Génère un constructeur sans arguments

@Entity
@Table (name="Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idChambre; // Clé primaire
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre TypeC;

    @OneToMany
    public Set<Reservation> reservation;

    @ManyToOne
    private Bloc bloc;
}
// many to many unidirectionel

// Constructeur et accesseurs (getters) et mutateurs (setters)

