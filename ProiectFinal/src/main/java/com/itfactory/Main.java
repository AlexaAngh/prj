package com.itfactory;

import com.itfactory.model.Dreptunghi;
import com.itfactory.model.Triunghi;

public class Main {

    public static void main(String[] args) {

        Triunghi triunghi = new Triunghi(15,17,20);
        System.out.println("Perimetrul triunghiului este:" + " " + triunghi.calculPerimetru() + ".");

        Dreptunghi dreptunghi = new Dreptunghi(35,20);
        System.out.println("Perimetrul dreptunghiului este:" + " " + dreptunghi.calculPerimetru() + ".");

    }


}
