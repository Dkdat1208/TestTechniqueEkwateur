package com.ekwateur;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClientParticulierTest {

    @Test
    public void testCalculerMontantFacture() {
        ClientParticulier clientParticulier = new ClientParticulier("EKW87654321", Civilite.MONSIEUR, "Dupont", "Jean");

        double consommationElectricite = 200; // en kWh
        double consommationGaz = 150; // en kWh

        assertEquals(24.2, clientParticulier.calculerMontantFacture(EnergieInit.electricite(), consommationElectricite), 0.01);
        assertEquals(17.25, clientParticulier.calculerMontantFacture(EnergieInit.gaz(), consommationGaz), 0.01);
    }
}
