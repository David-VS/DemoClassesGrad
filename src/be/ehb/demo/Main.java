package be.ehb.demo;

import be.ehb.demo.vormen.Cirkel;
import be.ehb.demo.vormen.Driehoek;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String tekst = new String("nieuwe tekst");
        Driehoek driehoek = new Driehoek(3, 3);
        driehoek.setHoogte(5);
        System.out.println(driehoek.opppervlakte());

        Cirkel myCirkel = new Cirkel(4);
        System.out.println(myCirkel.oppervlakte());
        Cirkel uwCirkel = new Cirkel(60);
        System.out.println(uwCirkel.oppervlakte());


    }
}