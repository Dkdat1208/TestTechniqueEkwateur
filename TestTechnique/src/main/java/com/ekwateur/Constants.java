package com.ekwateur;

/*
Cette classe gère toute les constantes liées au projet afin dans le but de centraliser les informations
* */
public class Constants {

    // Prix pour les particuliers
   static final double PRIX_KWH_ELECTRICITE_PARTICULIER = 0.121 ;
   static final double PRIX_KWH_GAZ_PARTICULIER = 0.115 ;

   // Prix pour les professionnels avec un CA Superieur à 1 000 000 €
  static final double PRIX_KWH_ELECTRICITE_PRO_CA_SUP = 0.114 ;
  static final double PRIX_KWH_GAZ_PRO_CA_SUP = 0.111 ;

   // Prix pour les professionnels avec un CA inférieur à 1 000 000 €
   static final double PRIX_KWH_ELECTRICITE_PRO_CA_INF = 0.118 ;
   static final double PRIX_KWH_GAZ_PRO_CA_INF = 0.113 ;

    // Référence client pattern
    static final String REFERENCE_CLIENT_PATTERN = "^EKW\\d{8}$";

    // Numéro SIRET pattern
    static final String NUMERO_SIRET_PATTERN = "\\d{14}";

    static  final  String EURO_SYMBOLE = " €";

    static  final  int  MAX_CHIFFRE_AFFAIRE = 1000000;


}
