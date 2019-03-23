package fr.uvsq.exo4_1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
        System.out.println(e1.affiche());
        
        e2.ajouteElement(p3);
        System.out.println(e2.affiche());
        
        e3.ajouteElement(e1);
        e3.ajouteElement(e2);
        System.out.println(e3.affiche());
        
    }
}
