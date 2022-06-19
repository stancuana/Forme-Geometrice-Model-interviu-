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
        return  new Cerc(this.punct,this.raza);
    }

    @Override
    public void afisare() {

        System.out.println("\n.........................................\nCercul este de centru "+this.punct+" si raza "+this.raza+"\n");

    }
}
