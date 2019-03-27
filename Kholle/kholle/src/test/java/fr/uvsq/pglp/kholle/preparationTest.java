package fr.uvsq.pglp.kholle;

import static org.junit.Assert.*;

import org.junit.Test;

public class preparationTest {

	@Test
	public void testCalculCout() {
		ingredient i1 = new ingredient("moza",3);	
		ingredient i2 = new ingredient("champignon",5);	  	
		preparation e1 = new preparation();
		e1.ajouteElement(i1);
		e1.ajouteElement(i2);
      
		assertEquals(e1.calculcout(),"Le prix de la preparation est de : 8");
	}
}
