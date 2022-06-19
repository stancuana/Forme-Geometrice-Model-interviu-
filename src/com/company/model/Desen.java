package com.company.model;

import java.util.ArrayList;

public class Desen extends Figura {

     private ArrayList<Figura> figuri;

    public Desen(ArrayList<Figura> figuri) {
        this.figuri = figuri;
    }


    @Override
    public void translatareX(int x) {

        for(Figura figura: figuri){

            figura.translatareX(x);
        }
    }

    @Override
    public void translatareY(int y) {
        for(Figura figura: figuri){

            figura.translatareY(y);
        }
    }

    @Override
    public Figura duplicare(Figura f) {

        for(Figura figura:figuri){

           return figura.duplicare(f);
       }
        return null;
    }

    @Override
    public  void  afisare() {

        for(Figura figura :figuri){

           figura.afisare();
        }
    }
}
