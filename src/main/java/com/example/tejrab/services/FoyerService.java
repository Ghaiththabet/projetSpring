package com.example.tejrab.services;

import com.example.tejrab.entities.Foyer;
import com.example.tejrab.repository.FoyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoyerService implements IntFoyerService {
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(Long ifFoyer) {
        return null;
    }

    @Override
    public void removeFoyer(Long ifFoyer) {

    }
}
