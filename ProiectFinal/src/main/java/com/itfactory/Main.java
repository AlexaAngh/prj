package com.itfactory;

import com.itfactory.model.Dreptunghi;
import com.itfactory.model.Triunghi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Help \n" +
                "0 - Ies din program\n" +
                "1 - Calculeaza perimetru triunghi\n" +
                "2 - Calculeaza perimetru dreptunghi\n");


        while (true) {

            System.out.print("Introduceti optiunea");

            int optiune = Integer.parseInt(scanner.nextLine());

            switch (optiune) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    PerimetruTriunghi();
                    break;

                case 2:
                    PerimetruDreptunghi();
                    break;

                default:
                    System.out.println("Help \n" +
                            "0 - Ies din program\n" +
                            "1 - Calculeaza perimetru triunghi\n" +
                            "2 - Calculeaza perimetru dreptunghi\n");


            }
        }
    }

    public static void PerimetruTriunghi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti laturile \n");
        int latura1 = Integer.parseInt(scanner.nextLine());
        int latura2 = Integer.parseInt(scanner.nextLine());
        int latura3 = Integer.parseInt(scanner.nextLine());

        Triunghi triunghi = new Triunghi(latura1,latura2,latura3);
        System.out.println("Perimetrul triunghiului este:" + " " + triunghi.calculPerimetru());
    }

    public static void PerimetruDreptunghi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti laturile \n");
        int lungime = Integer.parseInt(scanner.nextLine());
        int latime = Integer.parseInt(scanner.nextLine());

        Dreptunghi dreptunghi = new Dreptunghi(lungime,latime);
        System.out.println("Perimetrul dreptunghiului este:" + " " + dreptunghi.calculPerimetru());


    }


}
