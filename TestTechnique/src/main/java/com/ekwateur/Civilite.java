package com.ekwateur;

/*
*  Cette Enumération sert à gérer la civilité pour faciliter l'ajout ou la modification  dans le cas d'une évolution
* */
public enum Civilite {
    MONSIEUR("M."),
    MADAME("Mme"),
    MADEMOISELLE("Mlle");

    private final String abbreviation;

    Civilite(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
