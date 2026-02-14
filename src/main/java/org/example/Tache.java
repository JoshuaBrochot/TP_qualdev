package org.example;

public class Tache {
    private String nom;
    private Boolean termine;

    public Tache(String nom) {
        this.nom = nom;
        this.termine = Boolean.FALSE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getTermine() {
        return termine;
    }

    public void setTermine(Boolean termine) {
        this.termine = termine;
    }
}
