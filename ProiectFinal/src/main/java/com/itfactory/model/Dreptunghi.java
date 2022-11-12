package com.itfactory.model;

import com.itfactory.interfaces.FormaGeometrica;

public class Dreptunghi implements FormaGeometrica {

    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public int calculPerimetru() {
        return 2*lungime + 2*latime;
    }


    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }
}
