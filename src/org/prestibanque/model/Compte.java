package org.prestibanque.model;


import java.util.Date;

public abstract class Compte {
    // TODO Javadoc Compte

    private long numero;
    private double solde;
    private Date dateOuverture;

    public Compte(long numero, double solde, Date dateOuverture) {
        this.numero = numero;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
    }

    public Compte(long numero, double solde) {
        this(numero, solde, new Date());
    }

}
