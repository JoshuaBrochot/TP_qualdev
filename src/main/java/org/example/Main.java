package org.example;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Liste liste = new Liste();

        Boolean flag = Boolean.TRUE;
        String str = "";
        while (Objects.equals(flag, Boolean.TRUE)) {
            while (!Objects.equals(str, "1")
                    && !Objects.equals(str, "2")
                    && !Objects.equals(str, "3")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Ajouter une tache");
                System.out.println("2. Lister les tache");
                System.out.println("3. Quitter");
                System.out.println("Veuillez saisir une action :");
                str = sc.nextLine();

                if (Objects.equals(str, "1")) {
                    System.out.println("Veuillez saisir le nom de la tache :");
                    String nom_tache = sc.nextLine();
                    liste.addTache(nom_tache);
                    System.out.println("Tache ajouté !");
                    str = "";
                } else if (Objects.equals(str, "2")) {
                    liste.voirTaches();
                    str = "";
                } else {
                    flag = Boolean.FALSE;
                }
            }
        }
    }
}