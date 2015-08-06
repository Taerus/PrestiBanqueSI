package org.prestibanque.model;

public class Client {
	
	//Client Attributes
	public static int nextId = 0;
	
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private int telephone;
	private int id;
	private CompteCourant cc;
	private CompteEpargne cep;
	
	//Client's Constructor
	public Client(String nom, String prenom, String adresse, String codePostal, String ville, int telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.id = Client.nextId;
		Client.nextId++;
	}
	//Getters and Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getId() {
		return id;
	}
	public CompteCourant getCC(){
		return cc;
	}
	public void setCC(CompteCourant cc){
		this.cc=cc;
	}
	public CompteEpargne getCEP(){
		return cep;
	}
	public void setCEP(CompteEpargne cep){
		this.cep = cep;
	}
	

}
