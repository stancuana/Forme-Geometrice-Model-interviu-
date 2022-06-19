package com.company.model;

public class Eticheta extends Dreptunghi{

    private String text;


    public Eticheta(Linie linie1, Linie linie2,String text){

        super(linie1,linie2);
        this.text=text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Figura duplicare(Figura f) {
        return new Eticheta(this.getLinie1(),this.getLinie2(),this.text);
    }

    @Override
    public void afisare() {
        System.out.print("\n");
        System.out.print("\nEticheta are coordonatele: ");
        super.getLinie1().afisare();
        super.getLinie2().afisare();
        System.out.print("si textul: "+this.text+"\n");
        System.out.print("\n");
    }
}
