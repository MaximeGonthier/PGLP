
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe a = new Employe("Michel", "Ici", 4);
		Vendeur c = new Vendeur("Bob", "La", 4, 10);
		Manager e = new Manager("Jean", "La bas", 40, 3);
		Affichage b = new Affichage();
		b.Affiche(a);
		Affichage d = new Affichage();
		d.Affiche(c);
		Affichage f = new Affichage();
		f.Affiche(e);
	}

}
