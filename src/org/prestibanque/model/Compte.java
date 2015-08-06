package org.prestibanque.model;


import org.prestibanque.exceptions.InvalidNumberException;
import org.prestibanque.exceptions.InvalidOperationException;

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


    // Constructeur

    public Compte(long numero, double solde) {
        this(numero, solde, new Date());
    }


    // Accesseurs

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }


    // Méthodes

    public void crediter(double montant) throws InvalidNumberException {
        if (montant < 0) {
            throw new InvalidNumberException("Le montant à créditer doit être positif");
        }

        solde += montant;
    }

    public void debiter(double montant) throws InvalidOperationException {
        if (montant < 0) {
            throw new InvalidNumberException("Le montant à débiter doit être positif");
        }

        solde -= montant;
    }

    public boolean estADecouvert() {
        return solde < 0;
    }

}
