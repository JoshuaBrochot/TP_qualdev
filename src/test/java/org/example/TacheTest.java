package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TacheTest {

    @Test
    void TestGetterSetterNomCorrect() {
        Tache tache = new Tache("faire le TP");
        assertEquals("faire le TP", tache.getNom());
    }

    @Test
    void TestGetterSetterNomNonCorrect() {
        Tache tache = new Tache("faire le TP");
        assertNotEquals("faire le TD", tache.getNom());
    }

    @Test
    void TestGetterSetterTermine() {
        Tache tache = new Tache("faire le TP");
        assertEquals(Boolean.FALSE, tache.getTermine());

        tache.setTermine(Boolean.TRUE);
        assertEquals(Boolean.TRUE, tache.getTermine());
    }
}