package com.ekwateur;

public class FacturationService {
        public double calculerMontantFacture(Client client, Energie energie, double consommation) {
            return client.calculerMontantFacture(energie, consommation);
        }
}
