package com.wildcodeschool.challenge;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String acteur;
    private String sortie;

    // constructeur
    public Film(String titre, String acteur, String sortie) {
        this.titre = titre;
        this.acteur = acteur;
        this.sortie = sortie;
    }

    // getteurs et setteurs
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getActeur() {
        return this.acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    public String getSortie() {
        return this.sortie;
    }

    public void setSortie(String sortie) {
        this.sortie = sortie;
    }

}
