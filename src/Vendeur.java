
public class Vendeur extends Employe{

	private double commission;
	
	
	Vendeur(String Nom, String Adresse, int anciennete, double commission ) {
		super(Nom, Adresse, anciennete);
		this.commission = commission;
		this.calculsalaire();
	}
	
	public double calculsalaire()
	{
		return super.calculsalaire() + this.commission;
	}
	
	
	
}
