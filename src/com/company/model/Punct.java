package com.company.model;

import com.company.model.Figura;

public class Punct extends Figura {

    private int coordonataX;
    private int coordonataY;

    public Punct(int coordonataX, int coordonataY){

        this.coordonataX=coordonataX;
        this.coordonataY=coordonataY;
    }

    public int getCoordonataX() {
        return coordonataX;
    }

    public void setCoordonataX(int coordonataX) {
        this.coordonataX = coordonataX;
    }

    public int getCoordonataY() {
        return coordonataY;
    }

    public void setCoordonataY(int coordonataY) {
        this.coordonataY = coordonataY;
    }


    @Override
    public void translatareX(int x){
        this.coordonataX+=x;
    }

    @Override
    public void translatareY(int y){

        this.coordonataY+=y;
    }

    @Override
    public Figura duplicare(Figura f){

        Punct punct=(Punct) f;

        return punct;
    }

    @Override
    public void afisare(){

        System.out.println("Punctul este format din: \n Coordonata lui x: "+this.coordonataX+"\n Coordonata lui y: "+this.coordonataY);
    }
}

