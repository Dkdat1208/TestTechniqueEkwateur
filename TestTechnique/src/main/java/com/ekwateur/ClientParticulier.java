package com.ekwateur;
/*
 Dans cette classe on définit les propriétés necessaires de la classe
 on hérite de la classe mère pour obtenir le comportement et les attributs par defaut
 et  on redéfinit ensuite la méthode de calcule du  montant de la facture pour le client particulier
* */
public class ClientParticulier extends Client {
    private Civilite civilite;
    private String nom;
    private String prenom ;

    //Constructeur
    public ClientParticulier(String referenceClient, Civilite civilite, String nom, String prenom) {
        super(referenceClient);
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public double calculerMontantFacture(Energie energie, double consommation) {
        return consommation * energie.getPrixParticulier();    }

    @Override
    public String toString() {
        return "ClientParticulier {" +
                "reference Client='" + getReferenceClient() + '\'' +
                ", civilite=" + civilite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
