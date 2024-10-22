package com.example.tejrab.services;

import com.example.tejrab.entities.Chambre;
import com.example.tejrab.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChambreService implements IntChambreService{


    @Autowired
    ChambreRepository chambreRepository;

    public List<Chambre> getChambresByReservationStatus(boolean estValide) {
        return chambreRepository.findByReservationEstValide(estValide);}
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return null;
    }

    @Override
    public void removeChambre(Long idChambre) {

    }
}
