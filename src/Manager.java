
public class Manager extends Employe{

	private double commission;
	int sousfifres;
	
	
	Manager(String Nom, String Adresse, int anciennete, int sousfifres) {
		super(Nom, Adresse, anciennete);
		this.sousfifres = sousfifres;
		this.calculsalaire();
	}
	
	public double calculsalaire()
	{
		return super.calculsalaire() + sousfifres*100;
	}
	
	
	
}
