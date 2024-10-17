package com.ekwateur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FacturationServiceTest {


    @Test
    public void testReferenceClientInvalide() {

        String referenceInvalide = "ABC12345678";

        assertThrows(IllegalArgumentException.class, () -> {
            new ClientParticulier(referenceInvalide, Civilite.MONSIEUR, "Jean", "Paul");
        }, "Une exception doit être levée pour une référence client invalide, car la réference ne commence pas par EKW");
    }

    @Test
    public void testCalculerMontantFactureProCASuperieurAUnMillion() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345678901234", "Entreprise SA", 1500000);

        FacturationService facturationService = new FacturationService();

        double consommationElectricite = 500; // en kWh
        double consommationGaz = 300; // en kWh

        assertEquals(57.0, facturationService.calculerMontantFacture(clientPro, EnergieInit.electricite(), consommationElectricite), 0.01);
        assertEquals(33.3, facturationService.calculerMontantFacture(clientPro, EnergieInit.gaz(), consommationGaz), 0.01);
    }

    @Test
    public void testCalculerMontantFactureProCAInferieurAUnMillion() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345678901234", "Entreprise SA", 500000);

        FacturationService facturationService = new FacturationService();

        double consommationElectricite = 500; // en kWh
        double consommationGaz = 300; // en kWh

        assertEquals(59.0, facturationService.calculerMontantFacture(clientPro, EnergieInit.electricite(), consommationElectricite), 0.01);
        assertEquals(33.9, facturationService.calculerMontantFacture(clientPro, EnergieInit.gaz(), consommationGaz), 0.01);
    }

    @Test
    public void testCalculerMontantFactureParticulier() {
        ClientParticulier clientParticulier = new ClientParticulier("EKW87654321", Civilite.MADAME, "Gaelle", "Barnaba");

        FacturationService facturationService = new FacturationService();

        double consommationElectricite = 200; // en kWh
        double consommationGaz = 150; // en kWh

        assertEquals(24.2, facturationService.calculerMontantFacture(clientParticulier, EnergieInit.electricite(), consommationElectricite), 0.01);
        assertEquals(17.25, facturationService.calculerMontantFacture(clientParticulier, EnergieInit.gaz(), consommationGaz), 0.01);
    }


}
