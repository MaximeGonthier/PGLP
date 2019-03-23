package fr.uvsq.exo4_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntrepriseTest {
	
	@Test
	public void test() {
		 Personnel p1 = new Personnel
				  .Builder("Caumes", "Clément")
				  .build();
       Personnel p2 = new Personnel
				  .Builder("Merimi", "Mehdi")
				  .build();
       Personnel p3 = new Personnel
				  .Builder("Hequet", "Jonathan")
				  .build();
       Entreprise e1 = new Entreprise();
       Entreprise e2 = new Entreprise();
       Entreprise e3 = new Entreprise();
       
       e1.ajouteElement(p1);
       e1.ajouteElement(p2);
       assertEquals(e1.affiche(), "{[Caumes, Clément, 2000-01-01, 17314053, Stagiaire][Merimi, Mehdi, 2000-01-01, 17314053, Stagiaire]}");
       
       e2.ajouteElement(p3);
       assertEquals(e2.affiche(), "{[Hequet, Jonathan, 2000-01-01, 17314053, Stagiaire]}");
       
       e3.ajouteElement(e1);
       e3.ajouteElement(e2);
       assertEquals(e3.affiche(), "{{[Caumes, Clément, 2000-01-01, 17314053, Stagiaire][Merimi, Mehdi, 2000-01-01, 17314053, Stagiaire]}{[Hequet, Jonathan, 2000-01-01, 17314053, Stagiaire]}}");
	}

}
