package com.esprit.firstspringbootproject.repositories;

import  com.esprit.firstspringbootproject.entity.Foyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoyerRepository extends CrudRepository<Foyer,Integer> {
}