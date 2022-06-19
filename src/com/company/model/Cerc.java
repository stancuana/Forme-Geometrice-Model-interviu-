package com.company.model;

public class Cerc extends Figura {

    private Punct punct;
    private int raza;


    public Cerc(Punct punct, int raza){

        this.punct=punct;
        this.raza=raza;
    }


    public Punct getPunct() {
        return punct;
    }

    public void setPunct(Punct punct) {
        this.punct = punct;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }


    @Override
    public void translatareX(int x) {

        this.punct.translatareX(x);

    }

    @Override
    public void translatareY(int y) {

        this.punct.translatareY(y);
    }

    @Override
    public Figura duplicare(Figura f) {

        Cerc cerc=(Cerc) f;
        return cerc;
    }

    @Override
    public void afisare() {

        System.out.println("Cercul este format din: \n Punctul : ");
        this.punct.afisare();
        System.out.println("\nRaza de: "+this.raza);

    }
}
