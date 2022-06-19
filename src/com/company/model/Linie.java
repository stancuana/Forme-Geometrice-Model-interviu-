package com.company.model;

import com.company.model.Figura;
import com.company.model.Punct;

public class Linie extends Figura {

    private Punct punct1;
    private Punct punct2;


    public Linie(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }



    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }


    @Override
    public void translatareX(int x) {

        this.punct1.translatareX(x);
        this.punct2.translatareX(x);
    }

    @Override
    public void translatareY(int y) {

        this.punct1.translatareY(y);
        this.punct2.translatareY(y);
    }

    @Override
    public Figura duplicare(Figura f) {

        Linie linie=(Linie) f;
        return linie;
    }

    @Override
    public void afisare() {

        System.out.println("Linia este formata din: \n Punctul 1: ");
        this.punct1.afisare();
        System.out.println("\nPunctul 2: ");
        this.punct2.afisare();

    }
}
