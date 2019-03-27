package fr.uvsq.pglp.kholle;

import java.util.ArrayList;
import java.util.List;

public class preparation implements moza {
	private ArrayList<ingredient> contenu = new ArrayList <ingredient>();
	
	public preparation() {}
	
	public void ajouteElement(ingredient e) {
		contenu.add(e);
	}
	
	public String print() {
		String s="{";
		for(int i=0;i<contenu.size();i++) {
			s = contenu.get(i).print() + s;
		}
		s+="}";
		return s;
	}
}
