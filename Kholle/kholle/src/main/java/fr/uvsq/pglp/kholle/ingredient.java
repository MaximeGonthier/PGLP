package fr.uvsq.pglp.kholle;

public class ingredient implements moza {
	public String nom;
	public int cout;
	public ingredient (String nom, int cout) {
		this.nom = nom;
		this.cout = cout;
	}
	public String print() {
		return this.nom;
		//urn null;
	}
	
	public int getprix() {
		return this.cout;
	}
	
	
}
