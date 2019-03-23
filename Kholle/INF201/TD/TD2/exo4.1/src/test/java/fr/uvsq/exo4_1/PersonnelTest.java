package fr.uvsq.exo4_1;

import java.time.LocalDate;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonnelTest {

    @Test
    public void testConstructeur1(){
    	Personnel p = new Personnel
    				  .Builder("Caumes", "Clément")
    				  .build();
    	 assertEquals(p.getNom(), "Caumes");
    	 assertEquals(p.getPrenom(), "Clément");
    	 assertEquals(p.getDateNaissance(), LocalDate.of(2000, 1, 1));
    }

}