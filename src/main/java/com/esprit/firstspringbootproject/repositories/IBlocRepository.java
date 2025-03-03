package com.esprit.firstspringbootproject.repositories;

import com.esprit.firstspringbootproject.entity.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends CrudRepository<Bloc, Integer> {
}