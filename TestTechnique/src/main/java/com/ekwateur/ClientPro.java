package com.ekwateur;

/*
Dans cette classe on définit les propriétés necessaires de la classe
 on hérite de la classe mère pour obtenir le comportement et les attributs par defaut
 et  on redéfinit ensuite la méthode de calcule du  montant de la facture pour le client Pro
* */
public class ClientPro  extends Client{
    private String siret;
    private String raisonSociale;
    private double chiffreAffaire;

    //Constructeur
    public ClientPro(String referenceClient, String siret, String raisonSociale, double chiffreAffaire) {
        super(referenceClient);

        //Vérification  du numéro SIRET
        if(!isValidSiret(siret)){
            throw new IllegalArgumentException("La numéro SIRET doit comporter 14 chiffres.");
        }
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public String getSiret() {
        return siret;
    }

    /*
     * cette fonction a pour but de controler le fomat du numéro siret par defaut le numéro de siret doit contenir 14 chiffre
     * \\d{8} : pour signifier que l'on attend exactement 14 chiffres".
     * elle renvoit ensuite un boolean
     * */
    private boolean isValidSiret(String siret) {
        return siret.matches(Constants.NUMERO_SIRET_PATTERN);
    }

    //On redéfinit le calcul du montant de la facture pour le client Pro
    @Override
    public double calculerMontantFacture(Energie energie, double consommation) {
        if (chiffreAffaire > Constants.MAX_CHIFFRE_AFFAIRE) {
            return consommation * energie.getPrixProCAEleve();
        } else {
            return consommation * energie.getPrixProCAFaible();
        }
    }

    @Override
    public String toString() {
        return "ClientPro {" +
                "reference Client='" + getReferenceClient() + '\'' +
                ", numero SIRET='" + getSiret() + '\'' +
                ", raison Sociale='" + raisonSociale + '\'' +
                ", chiffre d'affaire=" + getChiffreAffaire() +
                '}';
    }
}
