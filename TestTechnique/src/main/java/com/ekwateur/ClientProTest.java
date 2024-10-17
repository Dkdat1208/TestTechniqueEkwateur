package com.ekwateur;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ClientProTest {

    @Test
    public void testNumeroSIRETValide() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345678901234", "Entreprise ENGIE", 1500000);
        assertEquals("12345678901234", clientPro.getSiret());
    }

    @Test
    public void testNumeroSIRETInvalide() {

        //siret invalide contient moins de 14 chiffres
        assertThrows(IllegalArgumentException.class, () -> {
            new ClientPro("EKW12345678", "1234567891024", "Entreprise ENGI", 1500000);
        });

        //siret invalide contient plus 14 chiffres
        assertThrows(IllegalArgumentException.class, () -> {
            new ClientPro("EKW175614790", "446923876698730", "Entreprise ENGIE", 1500000);
        });

        //siret invalide contient des caractères alaphabétique
        assertThrows(IllegalArgumentException.class, () -> {
            new ClientPro("EKW58462139", "2369745105CH2A", "Entreprise ENGIE", 1500000);
        });
    }

    @Test
    public void testCalculerMontantFactureCASuperieurAUnMillion() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345678901234", "Entreprise SA", 1500000);

        double consommationElectricite = 500; // en kWh
        double consommationGaz = 300; // en kWh

        assertEquals(57.0, clientPro.calculerMontantFacture(EnergieInit.electricite(), consommationElectricite), 0.01);
        assertEquals(33.3, clientPro.calculerMontantFacture(EnergieInit.gaz(), consommationGaz), 0.01);
    }

    @Test
    public void testCalculerMontantFactureCAInfieurAUnMillion() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345678901234", "Entreprise SA", 500000);

        double consommationElectricite = 500; // en kWh
        double consommationGaz = 300; // en kWh

        assertEquals(59.0, clientPro.calculerMontantFacture(EnergieInit.electricite(), consommationElectricite), 0.01);
        assertEquals(33.9, clientPro.calculerMontantFacture(EnergieInit.gaz(), consommationGaz), 0.01);
    }
}

