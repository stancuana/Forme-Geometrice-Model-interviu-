package com.company;

import com.company.model.*;

import java.util.ArrayList;

public class ControllElemente {

    public ArrayList load(){

        ArrayList lista=new ArrayList();

        Punct punct=new Punct(5,6);

        lista.add(punct);


        Punct punct1=new Punct(3,4);
        Punct punct2=new Punct(45,7);
        Linie linie=new Linie(punct1,punct2);

        lista.add(linie);


        Cerc cerc=new Cerc(punct,7);

        lista.add(cerc);


        Linie linie1=new Linie(punct1,punct2);
        Dreptunghi dreptunghi=new Dreptunghi(linie,linie1);

        lista.add(dreptunghi);


        Eticheta eticheta=new Eticheta(dreptunghi,"Forme geometrice");

        lista.add(eticheta);

        return lista;


    }


}
