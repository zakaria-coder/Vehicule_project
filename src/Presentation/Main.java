package Presentation;

import Metier.Avion;
import Metier.Moto;
import Metier.Voiture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("Toyota", 30000.0, "Camry", 2022);
        Moto moto1 = new Moto("Harley Davidson", 15000.0, "Sportster", 120);
        Avion avion1 = new Avion("Boeing", 50000000.0, "Air France", 900);

        voiture1.emettreSon();
        moto1.emettreSon();
        avion1.emettreSon();

        voiture1.afficherInformations();
        moto1.afficherInformations();
        avion1.afficherInformations();
    }
}

