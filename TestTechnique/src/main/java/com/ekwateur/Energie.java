package com.ekwateur;
/*
 *  Cette classe définie les proprietés liées à la consomation de l'energie
 * */
public class Energie {
    private TypeEnergie typeEnergie;
    private double prixParticulier;
    private double prixProCAFaible;
    private double prixProCAEleve;

    //Constructeur de la classe
    public Energie(TypeEnergie typeEnergie, double prixParticulier, double prixProCAFaible, double prixProCAEleve) {
        this.typeEnergie = typeEnergie;
        this.prixParticulier = prixParticulier;
        this.prixProCAFaible = prixProCAFaible;
        this.prixProCAEleve = prixProCAEleve;
    }

    public double getPrixParticulier() {
        return prixParticulier;
    }

    public double getPrixProCAFaible() {
        return prixProCAFaible;
    }

    public double getPrixProCAEleve() {
        return prixProCAEleve;
    }
}
