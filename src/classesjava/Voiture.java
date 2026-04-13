package classesjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;
    pneus pneus;
    public Voiture(String marque, String modele, int annee, double prix, pneus pneus) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.pneus = pneus;
    }
    public void afficherDescription(){
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Année : " + annee);
        System.out.println("Prix : " + prix + " €");
    }
}


