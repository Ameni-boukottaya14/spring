package com.esprit.firstspringbootproject.service;

import com.esprit.firstspringbootproject.entity.Chambre;
import com.esprit.firstspringbootproject.repositories.IChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChambreService implements IChambreService {
    @Autowired
    IChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return List.of();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById((int)idChambre).orElse(null);
    }
}