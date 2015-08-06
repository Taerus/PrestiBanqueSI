package org.prestibanque.model;


import org.prestibanque.exceptions.InvalidNumberException;
import org.prestibanque.exceptions.InvalidOperationException;

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


    // Accesseurs

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) throws InvalidNumberException {
        if ( taux < 0 ) {
            throw new InvalidNumberException("Le taux doit être positif");
        }
        this.taux = taux;
    }

    // Méthodes


    @Override
    public void debiter(double montant) throws InvalidOperationException {
        if (getSolde() - montant < 0) {
            throw new InvalidOperationException("Le découvert n'est pas autorisé sur un compte épargne");
        }
        super.debiter(montant);
    }
}
