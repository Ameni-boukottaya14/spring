package com.esprit.firstspringbootproject.repositories;

import  com.esprit.firstspringbootproject.entity.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite, Integer> {
}