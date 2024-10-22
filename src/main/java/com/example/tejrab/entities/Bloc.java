package com.example.tejrab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idBloc ;
    private String nomBloc ;
    private Long capaciteBloc ;
    @ManyToOne
    private Foyer foyer ;

    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres ;
}
