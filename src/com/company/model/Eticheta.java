package com.company.model;

public class Eticheta extends Figura{


    private Dreptunghi dreptunghi;
    private String text;


    public Eticheta(Dreptunghi dreptunghi, String text){

        this.dreptunghi=dreptunghi;
        this.text=text;
    }


    public Dreptunghi getDreptunghi() {
        return dreptunghi;
    }

    public void setDreptunghi(Dreptunghi dreptunghi) {
        this.dreptunghi = dreptunghi;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public void translatareX(int x) {

        this.dreptunghi.translatareX(x);
    }

    @Override
    public void translatareY(int y) {

       this.dreptunghi.translatareY(y);
    }

    @Override
    public Figura duplicare(Figura f) {

        Eticheta eticheta=(Eticheta) f;
        return eticheta;
    }

    @Override
    public void afisare() {

        System.out.println("Eticheta este formata din: \n Dreptunghiul: ");
        this.dreptunghi.afisare();
        System.out.println("\nTextul: "+this.getText());
    }
}
