package fr.uvsq.pglp.kholle;

public class App 
{
    public static void main( String[] args )
    {
        pizza p1 = new pizza("reine","tomate");
		ingredient i1 = new ingredient("moza",3);	
		ingredient i2 = new ingredient("champignon",5);	  
		
      preparation e1 = new preparation();
      e1.ajouteElement(i1);
      e1.ajouteElement(i2);
      System.out.println(e1.print());
      System.out.println(e1.calculcout());
    }
}
