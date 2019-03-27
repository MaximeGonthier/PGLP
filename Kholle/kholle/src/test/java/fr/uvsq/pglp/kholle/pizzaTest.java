package fr.uvsq.pglp.kholle;

import static org.junit.Assert.*;

import org.junit.Test;

public class pizzaTest {

	@Test
	public void testBuilder(){
	pizza p = new pizza.Builder("margarita").build();
	    	 assertEquals(p.getNom(), "margarita");	    	 
	    }
	
	@Test
	public void testCout(){
	pizza p = new pizza.Builder("reine").build();
	    	 assertEquals(p.getNom(), "reine");	    	 
	    }

}
