package com.iset.projet.dao;

import com.iset.projet.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface membreRepository extends JpaRepository<Membre, Long> {
}
