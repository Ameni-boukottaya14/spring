package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entity.Universite;
import com.esprit.firstspringbootproject.repositories.IUniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversiteService implements IUniversiteService {
    @Autowired
    IUniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return List.of();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById((int) idUniversite).get();
    }
}