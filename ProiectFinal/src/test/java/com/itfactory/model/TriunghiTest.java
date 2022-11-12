package com.itfactory.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriunghiTest {

    @Test
    void testPerimetruTriunghi(){
        Triunghi triunghi = new Triunghi(2,6,1);
        assertEquals(9,triunghi.calculPerimetru());
    }


}