package com.example.tejrab.services;

import com.example.tejrab.entities.Foyer;

import java.util.List;

public interface IntFoyerService {
    List<Foyer> retrieveAllFoyers() ;
    Foyer addFoyer(Foyer f) ;
    Foyer updateFoyer(Foyer f) ;
    Foyer retrieveFoyer(Long idFoyer) ;
    void removeFoyer(Long idFoyer) ;

}
