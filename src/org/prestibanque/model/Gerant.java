package org.prestibanque.model;

import java.util.ArrayList;

/**
 * @author nubinub
 *
 */
public class Gerant {

	private ArrayList<Conseiller> conseillers;
	
	public Gerant(){
		super();
		this.conseillers = new ArrayList<Conseiller>();
	}
	
	public ArrayList<Conseiller> getConseillers(){
		return conseillers;
	}
	public void setConseillers(ArrayList<Conseiller> conseillers){
		this.conseillers = conseillers;
	}
	
	/**
	 * Ajouter le conseiller passé en paramètre à la liste des conseillers.
	 * @param c Conseiller à ajouter à la liste des conseillers
	 */
	public void addConseiller(Conseiller c){
		this.conseillers.add(c);
	}
}
