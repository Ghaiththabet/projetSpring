package com.example.tejrab.repository;

import com.example.tejrab.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRespository extends CrudRepository<Reservation, String> {
}
