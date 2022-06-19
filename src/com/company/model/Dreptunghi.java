package com.company.model;

public class Dreptunghi extends Figura{

    private Linie linie1;
    private Linie linie2;

    public Dreptunghi(Linie linie1, Linie linie2){

        this.linie1=linie1;
        this.linie2=linie2;
    }


    public Linie getLinie1() {
        return linie1;
    }

    public void setLinie1(Linie linie1) {
        this.linie1 = linie1;
    }

    public Linie getLinie2() {
        return linie2;
    }

    public void setLinie2(Linie linie2) {
        this.linie2 = linie2;
    }


    @Override
    public void translatareX(int x) {

        this.linie1.translatareX(x);
        this.linie2.translatareX(x);
    }

    @Override
    public void translatareY(int y) {

        this.linie1.translatareY(y);
        this.linie2.translatareY(y);
    }

    @Override
    public Figura duplicare(Figura f) {

        return new Dreptunghi(this.linie1, this.linie2);
    }

    @Override
    public void afisare() {

        System.out.print("Dreptunghiul are coordonatele: ");
        this.getLinie1().afisare();
        System.out.print(" ");
        this.getLinie2().afisare();

    }
}
