package com.example.tejrab.services;

import com.example.tejrab.entities.Bloc;
import com.example.tejrab.entities.Chambre;

import java.util.List;

public interface IntBlocService {
    List<Bloc> retrieveAllBlocs() ;
    Bloc addBloc(Bloc c ) ;
    Bloc updateBloc(Bloc c) ;
    Bloc retrieveBloc(Long idBloc) ;
    void removeBloc(Long idBloc) ;

}
