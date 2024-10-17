package com.ekwateur;

/*
 *  Cette classe centralise l'initialisation du constructeur de la classe Energie
 *  pour les deux types de consomation gaz et electricté
 * */
public class EnergieInit {

    public static Energie electricite(){
        return new  Energie(TypeEnergie.ELECTRICITE,
                Constants.PRIX_KWH_ELECTRICITE_PARTICULIER,
                Constants.PRIX_KWH_ELECTRICITE_PRO_CA_INF,
                Constants.PRIX_KWH_ELECTRICITE_PRO_CA_SUP);
    }

    public static Energie gaz(){
        return new Energie(TypeEnergie.GAZ,
                Constants.PRIX_KWH_GAZ_PARTICULIER,
                Constants.PRIX_KWH_GAZ_PRO_CA_INF,
                Constants.PRIX_KWH_GAZ_PRO_CA_SUP);
    }
}
