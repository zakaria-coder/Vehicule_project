package Presentation;

import Metier.Avion;
import Metier.Moto;
import Metier.Vehicule;
import Metier.Voiture;

import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //list of objects
        Vehicule []vehicules =new Vehicule[5];
        vehicules[0]  = new Voiture("v1",1100000.0,"vc4",2024);
        vehicules[1]  = new Avion("v2",1200000.0,"vc4",2025);
        vehicules[2]  = new Avion("v3",1300000.0,"vc4",1935);
        vehicules[3]  = new Moto("v4",1400000.0,"vc4",1999);
        vehicules[4]  = new Voiture("v5",1500000.0,"vc4",1985);

        Vehicule v1 = new Voiture("Toyota", 30000.0, "Camry", 2022);
        Vehicule m1 = new Moto("Harley Davidson", 15000.0, "Sportster", 120);
        Vehicule a1 = new Avion("Boeing", 50000000.0, "Air France", 900);


        for (Vehicule v:vehicules) {
               if (v instanceof  Avion){
                   v.emettreSon();
                   v.afficherInformations();
               }
            }

        }








//        voiture1.emettreSon();
//        moto1.emettreSon();
//        avion1.emettreSon();
//
//        voiture1.afficherInformations();
//        moto1.afficherInformations();
//        avion1.afficherInformations();
    }


