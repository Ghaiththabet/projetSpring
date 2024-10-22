package com.example.tejrab.services;

import com.example.tejrab.entities.Bloc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocService implements IntBlocService{

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return List.of();
    }

    @Override
    public Bloc addBloc(Bloc c) {
        return null;
    }

    @Override
    public Bloc updateBloc(Bloc c) {
        return null;
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return null;
    }

    @Override
    public void removeBloc(Long idBloc) {

    }
}
