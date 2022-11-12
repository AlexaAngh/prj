package com.itfactory.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DreptunghiTest {

    @Test
    void testDreptunghiClass(){
        /*
        * TEST PENTRU VERIFICARE FORMULA DE CALCUL A PERIMETRULUI PENTRU UN DREPTUNGHI
        * */
        Dreptunghi dreptungi = new Dreptunghi(1,2);
        assertEquals(6,dreptungi.calculPerimetru());
    }


}