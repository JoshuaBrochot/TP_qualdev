package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Liste {
    private ArrayList<Tache> liste_tache;

    public Liste() {
        liste_tache = new ArrayList<Tache>();
    }

    public void voirTaches() {
        for (int i = 0; i < this.liste_tache.toArray().length; i++) {
            System.out.println(this.liste_tache.get(i).getNom());
        }
    }

    public void addTache(String nom) {
        Tache nouvelle_tache = new Tache(nom);
        this.liste_tache.add(nouvelle_tache);
    }
}
