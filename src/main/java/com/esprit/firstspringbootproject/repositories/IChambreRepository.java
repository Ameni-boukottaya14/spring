package com.esprit.firstspringbootproject.repositories;

import  com.esprit.firstspringbootproject.entity.Chambre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre, Integer> {
}