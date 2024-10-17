package com.ekwateur;

/*
* Cette classe est typé abstract  permettra de partager l'attribut referenceClient et les méthodes communes aux classes qui vont
* heriter de celle ci
* */
public abstract class Client {
    protected String referenceClient;


    public Client(String referenceClient) {
        if (!isValidReference(referenceClient)) {
            throw new IllegalArgumentException("La référence client doit obligatoirement commencer par 'EKW' suivi de 8 caractères numériques.");
        }
        this.referenceClient = referenceClient;
    }

    /*
    * cette fonction a pour but de controler le fomat de la référence client
    * ^ indique le debut de la chaine
    * EKW : La chaîne doit commencer par les caractères
    * \\d{8} : Exactement 8 chiffres doivent suivre "EKW".
    * $ : Indique la fin de la chaîne.
    * elle renvoit ensuite un boolean
     * */
    private boolean isValidReference(String referenceClient) {
        return referenceClient.matches(Constants.REFERENCE_CLIENT_PATTERN);
    }

    public String getReferenceClient() {
        return referenceClient;
    }
    public abstract double calculerMontantFacture(Energie energie, double consommation);

}
