package org.prestibanque.service;

import java.util.HashSet;
import java.util.Set;

import org.prestibanque.model.*;

public class PrestiBanqueSI {
		
	private PrestiBanqueSI(){
		
	}
	
	public  static Set<Client> auditerAgence(Agence agence){
		Set<Client> retour = new HashSet<Client>();
		Gerant ger = agence.getGerant();
		
		for(Conseiller cons : ger.getConseillers()){
			for(Client cli : cons.getClients()){
				if(cli.getCC()!=null && cli.getCC().getSolde()<-5000f)
					retour.add(cli);
			}
		}
		
		return retour;
	}
	
	public static void creerClient(){
		
	}
	
	public static  void modifierClient(){
		
	}
	
	public static void lireClient(){
		
	}
	
	public static void supprimerClient(){
		
	}
	
	
	
}
