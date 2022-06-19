package com.company.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DesenTest {

    @Test
    public void ex1(){


        Punct punct1=new Punct(5,6);

        Linie linie0=new Linie(new Punct(3,4),new Punct(3,4));
        Linie linie1=new Linie(new Punct(4,5),new Punct(8,9));
        Linie linie2=new Linie(new Punct(6,6),new Punct(7,9));


        Cerc cerc=new Cerc(new Punct(7,9),5);
        Dreptunghi dreptunghi=new Dreptunghi(new Linie(new Punct(7,8),new Punct(8,9)),new Linie(new Punct(4,5),new Punct(6,7)));
        Eticheta eticheta=new Eticheta(linie1,linie2,"Forme geometrice");

        ArrayList<Figura>figuri = new ArrayList<>();

        figuri.add(cerc);
        figuri.add(dreptunghi);
        figuri.add(eticheta);
        figuri.add(linie0);
        figuri.add(linie1);
        figuri.add(linie2);
        figuri.add(punct1);

        Desen desen= new Desen(figuri);

        desen.afisare();
        desen.translatareX(10);
        desen.translatareY(2);
        desen.afisare();

        System.out.println("------------------------------------------");
        desen.duplicare(cerc).afisare();

    }

}