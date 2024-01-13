package Metier;

public class Voiture extends Vehicule {
    private String modele;
    private int annee;

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    public void info(){
        System.out.println(modele + annee);
    }

    @Override
    public boolean equals(Object obj) {
        Voiture v =(Voiture) obj;

        //pour comparer une chaine de caractére entre deux objet
        return this.modele.equals(v.modele) && this.annee == v.annee ;
    }

}

