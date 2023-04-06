package com.iset.projet.services;

import com.iset.projet.dao.membreRepository;
import com.iset.projet.entities.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MembreServiceImpl implements membreService{
    @Autowired
     private membreRepository membreRepository;

    @Override
    public Membre saveMembre(Membre m) {
        return membreRepository.save(m);
    }
    @Override
    public Membre updateMembre(Membre m) {
        return membreRepository.save(m);
    }
    @Override
    public void deleteMembre(Membre m) {
        membreRepository.delete(m);

    }
    @Override
    public void deleteMembreById(Long id) {
        membreRepository.deleteById(id); }
    @Override
    public Membre getMembre(Long id) {
        return membreRepository.findById(id).get();
    }
    @Override
    public List<Membre> getAllMembre() {

        return membreRepository.findAll();
    }
    @Override
    public Page<Membre> getAllMembreParPage(int page, int size) {
        // TODO Auto-generated method stub
        return membreRepository.findAll(PageRequest.of(page, size));
    }

}
