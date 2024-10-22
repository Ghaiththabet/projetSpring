package com.example.tejrab.repository;

import com.example.tejrab.entities.Chambre;
import com.example.tejrab.entities.TypeChambre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChambreRepository extends CrudRepository<Chambre, Long> {
    List<Chambre> findByNumeroChambre(Long numeroChambre);
    List<Chambre> findByBlocCapaciteBloc(Long capaciteBloc);

    List<Chambre> findByBlocNomBlocAndTypeC(String nomBloc, TypeChambre typeC);

    List<Chambre> findByReservationEstValide(boolean estValide);

    List<Chambre> findByBlocNomBlocAndBlocCapaciteBlocGreaterThan(String nomBloc, Long capacity);




}

