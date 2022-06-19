package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {

	/*

	    PUNCT

	    Punct punct=new Punct(3,4);

        System.out.println("AFISARE");
        punct.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE X");
        punct.translatareX(3);
        punct.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE Y");
        punct.translatareY(10);
        punct.afisare();
        System.out.println("\n");

        System.out.println("DUPLICARE");
        punct.duplicare(punct);
        punct.afisare();




        LINIE

        Punct punct1=new Punct(5,6);
        Punct punct2=new Punct(10,-2);

        Linie linie=new Linie(punct1,punct2);

        System.out.println("AFISARE");
        linie.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE X");
        linie.translatareX(3);
        linie.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE Y");
        linie.translatareY(10);
        linie.afisare();
        System.out.println("\n");

        System.out.println("DUPLICARE");
        linie.duplicare(linie);
        linie.afisare();




        CERC

        Punct punct=new Punct(5,6);
        Cerc cerc=new Cerc(punct,4);

        System.out.println("AFISARE");
        cerc.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE X");
        cerc.translatareX(3);
        cerc.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE Y");
        cerc.translatareY(10);
        cerc.afisare();
        System.out.println("\n");

        System.out.println("DUPLICARE");
        cerc.duplicare(cerc);
        cerc.afisare();





        DREPTUNGHI

        Punct punct1=new Punct(5,6);
        Punct punct2=new Punct(10,-2);

        Linie linie1=new Linie(punct1,punct2);

        Punct punct3=new Punct(7,9);
        Punct punct4=new Punct(1,-6);

        Linie linie2=new Linie(punct2,punct3);

        Dreptunghi dreptunghi=new Dreptunghi(linie1,linie2);

        System.out.println("AFISARE");
        dreptunghi.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE X");
        dreptunghi.translatareX(3);
        dreptunghi.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE Y");
        dreptunghi.translatareY(10);
        dreptunghi.afisare();
        System.out.println("\n");

        System.out.println("DUPLICARE");
        dreptunghi.duplicare(dreptunghi);
        dreptunghi.afisare();

	 */

        //ETICHETA

        Punct punct1=new Punct(5,6);
        Punct punct2=new Punct(10,-2);

        Linie linie1=new Linie(punct1,punct2);

        Punct punct3=new Punct(7,9);
        Punct punct4=new Punct(1,-6);

        Linie linie2=new Linie(punct2,punct3);

        Eticheta eticheta=new Eticheta(linie1,linie2,"Model Interviu");

        System.out.println("AFISARE");
        eticheta.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE X");
        eticheta.translatareX(3);
        eticheta.afisare();
        System.out.println("\n");

        System.out.println("TRANSLATARE Y");
        eticheta.translatareY(10);
        eticheta.afisare();
        System.out.println("\n");

        System.out.println("DUPLICARE");
        eticheta.duplicare(eticheta);
        eticheta.afisare();

    }
}
