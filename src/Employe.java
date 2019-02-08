
public class Employe {
	private String Nom;
	private String Adresse;
	private double Salaire;
	public int anciennete;
	
	Employe(String Nom, String Adresse, int anciennete){
		this.Nom = Nom;
		this.Adresse = Adresse;
		this.anciennete = anciennete;
	}
	
	public double calculsalaire()
	{
		return 1500+20*this.anciennete;
	}
	
	public String getNom() {
		return this.Nom;
	}
	
	public String getAdresse() {
		return this.Adresse;
	}
	
	
	
}
