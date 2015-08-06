package org.prestibanque.model;

import java.util.Vector;

/**
 * @author nubinub
 *
 */
public class Conseiller {	
	//conseiller attributes
	private Vector<Client> clients;
	
	public Conseiller(){
		super();
		this.clients = new Vector<Client>();
	}	
	
	//Getters and Setters
	public Vector<Client> getClients(){
		return this.clients;
	}
	public void setClients(Vector<Client> clients){
		this.clients = clients;
	}
	
	/**
	 * Cherche et retourne un client dans le vector clients.
	 * @param identifiant Identifiant du client recherché
	 * @return Client dont l'identifiant est passé en paramètre, null si celui-ci n'existe pas
	 */
	public Client trouverClient(int identifiant){
		Client retour = null;
		
		for(int i=0;i<clients.size();++i){
			if(clients.elementAt(i).getId()==identifiant){
				retour = clients.elementAt(i);
				break;
			}
		}
		
		return retour;
	}
	
	/**
	 * Ajoute un client à la liste des clients du conseiller
	 * @param cli Client à ajouter dans le vector clients.
	 */
	public void addClient(Client cli){
		this.clients.addElement(cli);
	}
	
}
