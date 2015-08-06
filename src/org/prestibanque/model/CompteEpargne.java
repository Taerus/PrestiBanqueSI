package org.prestibanque.model;


import org.prestibanque.exceptions.InvalidNumberException;

import java.util.Date;

public class CompteEpargne extends Compte {
    // TODO Javadoc CompteEpargne

    private float taux;


    // Constructeurs

    public CompteEpargne(long numero, double solde, Date dateOuverture, float taux) {
        super(numero, solde, dateOuverture);
        setTaux(taux);
    }

    public CompteEpargne(long numero, double solde, Date dateOuverture) {
        this(numero, solde, dateOuverture, 3.f);
    }


    // Getters / Setters

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) throws InvalidNumberException {
        if ( taux < 0 ) {
            throw new InvalidNumberException("Le taux doit être positif");
        }
        this.taux = taux;
    }

}
