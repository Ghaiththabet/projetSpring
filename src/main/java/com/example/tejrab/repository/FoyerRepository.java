package com.example.tejrab.repository;

import com.example.tejrab.entities.Foyer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoyerRepository extends CrudRepository<Foyer, Long> {
    List<Foyer> findByCapaciteFoyerGreaterThan(Long capaciteFoyer);
    List<Foyer> findByUniversiteNomUniversite(String nom) ;

}
