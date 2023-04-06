package com.iset.projet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMembre;
    private String nomMembre;
    private String prenomMembre;
    private String telMembre;
    private String emailMembre;

    public Membre(Long idMembre, String nomMembre, String prenomMembre, String telMembre, String emailMembre) {
        this.idMembre = idMembre;
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.telMembre = telMembre;
        this.emailMembre = emailMembre;
    }

    public Membre() {
    }

    public Long getIdMembre() {
        return idMembre;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    public String getPrenomMembre() {
        return prenomMembre;
    }

    public String getTelMembre() {
        return telMembre;
    }

    public String getEmailMembre() {
        return emailMembre;
    }

    public void setIdMembre(Long idMembre) {
        this.idMembre = idMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    public void setTelMembre(String telMembre) {
        this.telMembre = telMembre;
    }

    public void setEmailMembre(String emailMembre) {
        this.emailMembre = emailMembre;
    }
}
