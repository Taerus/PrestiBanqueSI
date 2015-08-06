package org.prestibanque.model;

import java.util.Date;

public class Agence {
	
	//Agence attributes
	private String identifiant;
	private Date creationDate;
	private Gerant gerant;
	
	public Agence(String identifiant,Date creationDate,Gerant gerant){
		super();
		this.identifiant=identifiant;
		this.creationDate=creationDate;
		this.gerant = gerant;
	}	
	public Agence(String identifiant,Date creationDate){
		this(identifiant,creationDate,new Gerant());		
	}	
	public Agence(String identifiant){
		this(identifiant,new Date());
	}
	
	//getters and setters
	public String getIdentifiant(){
		return identifiant;
	}
	public void setIdentifiant(String identifiant){
		this.identifiant = identifiant;
	}	
	public Date getCreationDate(){
		return creationDate;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate = creationDate;
	}
	public Gerant getGerant(){
		return gerant;
	}
	public void setGerant(Gerant gerant){
		this.gerant = gerant;
	}
}
