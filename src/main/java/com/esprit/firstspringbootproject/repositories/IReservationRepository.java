package com.esprit.firstspringbootproject.repositories;

import  com.esprit.firstspringbootproject.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation, Integer> {
}
