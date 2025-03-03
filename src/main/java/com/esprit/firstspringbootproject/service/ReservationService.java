package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entity.Reservation;
import com.esprit.firstspringbootproject.repositories.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationService implements IRerservationService{
    @Autowired
    IReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {

        return List.of();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(Integer.valueOf(idReservation)).get();
    }
}