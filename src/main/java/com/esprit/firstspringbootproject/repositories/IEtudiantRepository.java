package com.esprit.firstspringbootproject.repositories;

import  com.esprit.firstspringbootproject.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {
}