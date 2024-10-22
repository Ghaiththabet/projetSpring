package com.example.tejrab.services;

import com.example.tejrab.entities.Chambre;

import java.util.List;

public interface IntChambreService {
    List<Chambre> retrieveAllChambres() ;
    Chambre addChambre(Chambre c ) ;
    Chambre updateChambre(Chambre c) ;
    Chambre retrieveChambre(Long idChambre) ;
    void removeChambre(Long idChambre) ;
}
