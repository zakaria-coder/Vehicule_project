package Metier;

public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule() {

    }

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations() {
        System.out.println("Informations du Véhicule:");
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix + " euros");
    }
}