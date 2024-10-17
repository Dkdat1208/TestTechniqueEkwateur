package com.ekwateur;

public class Main {
    public static void main(String[] args) {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345678901234", "Entrepise Engie", 1500000);

        ClientParticulier clientParticulier = new ClientParticulier("EKW87654321", Civilite.MONSIEUR, "Gilles", "Bouleau");

        FacturationService facturationService = new FacturationService();

        double consommationElectricitePro = 500; // en kWh
        double consommationGazPro = 300; // en kWh

        //calcule du montant de la facture pour les clients Pro
        double montantElectriciteClientPro = facturationService.calculerMontantFacture(clientPro, EnergieInit.electricite(), consommationElectricitePro);
        double montantGazClientPro = facturationService.calculerMontantFacture(clientPro, EnergieInit.gaz(), consommationGazPro);

        double consommationElectriciteClientParticulier = 200; // en kWh
        double consommationGazClientParticulier = 150; // en kWh

        //calcule du montant de la facture pour les clients Particulier
        double montantElectriciteClientParticulier = facturationService.calculerMontantFacture(clientParticulier, EnergieInit.electricite(), consommationElectriciteClientParticulier);
        double montantGazClientParticulier = facturationService.calculerMontantFacture(clientParticulier, EnergieInit.gaz(), consommationGazClientParticulier);

        System.out.println(clientPro);
        System.out.println("Montant à facturer pour l'électricité  : " + montantElectriciteClientPro + Constants.EURO_SYMBOLE);
        System.out.println("Montant à facturer pour le gaz  : " + montantGazClientPro + Constants.EURO_SYMBOLE);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.println(clientParticulier);
        System.out.println("Montant à facturer pour l'électricité  : " + montantElectriciteClientParticulier + Constants.EURO_SYMBOLE);
        System.out.println("Montant à facturer pour le gaz: " + montantGazClientParticulier + Constants.EURO_SYMBOLE);
    }
}

