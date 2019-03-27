package fr.uvsq.pglp.kholle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ingredientTest {

	@Test
	public void testnom() {
		ingredient i1 = new ingredient("moza",3);	  
	    assertEquals(i1.nom,"moza");

	}
	
	@Test
	public void testprix() {
		ingredient i1 = new ingredient("moza",3);	  
	    assertEquals(i1.cout,3);

	}


}
