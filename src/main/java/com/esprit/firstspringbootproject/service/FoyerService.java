package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entity.Foyer;
import com.esprit.firstspringbootproject.repositories.IFoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoyerService implements IFoyerService {
    @Autowired
    IFoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return List.of();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById((int) idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById((int) idFoyer);
    }

}
