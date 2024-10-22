package com.example.tejrab.repository;

import com.example.tejrab.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc, Long> {

    List<Bloc> findByFoyerUniversiteNomUniversite(String nomUniversity);


}
