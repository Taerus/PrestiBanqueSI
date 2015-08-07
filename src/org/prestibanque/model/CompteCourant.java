package org.prestibanque.model;


import java.util.Date;

public class CompteCourant extends Compte {
    // TODO Javadoc CompteCourant

    private double autorisationDecouvert;


    // Constructeurs

    public CompteCourant(long numero, double solde, Date dateOuverture, double autorisationDecouvert) {
        super(numero, solde, dateOuverture);
        this.autorisationDecouvert = autorisationDecouvert;
    }

    public CompteCourant(long numero, double solde, Date dateOuverture) {
        this(numero, solde, dateOuverture, 1000.f);
    }


    // Accesseurs

    public double getAutorisationDecouvert() {
        return autorisationDecouvert;
    }

    public void setAutorisationDecouvert(double autorisationDecouvert) {
        this.autorisationDecouvert = autorisationDecouvert;
    }

    public boolean estSousLeSeuilDeDecouvert() {
        return getSolde() < autorisationDecouvert;
    }

}
