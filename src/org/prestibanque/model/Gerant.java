package org.prestibanque.model;

import java.util.Vector;

/**
 * @author nubinub
 *
 */
public class Gerant {

	private Vector<Conseiller> conseillers;
	
	public Gerant(){
		super();
		this.conseillers = new Vector<Conseiller>();
	}
	
	/**
	 * Ajouter le conseiller passé en paramètre à la liste des conseillers.
	 * @param c Conseiller à ajouter à la liste des conseillers
	 */
	public void addConseiller(Conseiller c){
		this.conseillers.addElement(c);
	}
}
