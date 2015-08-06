package org.prestibanque.model;

import java.util.ArrayList;

/**
 * @author nubinub
 *
 */
public class Conseiller {	
	//conseiller attributes
	private ArrayList<Client> clients;
	
	public Conseiller(){
		super();
		this.clients = new ArrayList<Client>();
	}	
	
	//Getters and Setters
	public ArrayList<Client> getClients(){
		return this.clients;
	}
	public void setClients(ArrayList<Client> clients){
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
			if(clients.get(i).getId()==identifiant){
				retour = clients.get(i);
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
		this.clients.add(cli);
	}
	
}
