package com.iset.projet.services;

import com.iset.projet.entities.Membre;
import org.springframework.data.domain.Page;

import java.util.List;

public interface membreService {
        Membre saveMembre(Membre m);
    Membre updateMembre(Membre m);
        void deleteMembre(Membre m);
        void deleteMembreById(Long id);
    Membre getMembre(Long id);
        List<Membre> getAllMembre();
    Page<Membre> getAllMembreParPage(int page, int size);
}
