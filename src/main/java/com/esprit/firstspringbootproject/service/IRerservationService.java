package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entity.Reservation;

import java.util.List;

public interface IRerservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);
}