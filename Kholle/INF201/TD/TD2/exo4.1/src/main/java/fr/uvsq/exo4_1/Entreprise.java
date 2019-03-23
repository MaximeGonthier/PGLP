package fr.uvsq.exo4_1;

import java.util.List;
import java.util.ArrayList;

public class Entreprise implements Element{
	
	private List<Element> contenu = new ArrayList <Element>();
	
	public Entreprise() {}
	
	public void ajouteElement(Element e) {
		contenu.add(e);
	}
	
	@Override
	public String affiche() {
		String s="{";
		for(int i=0;i<contenu.size();i++) {
			s+=contenu.get(i).affiche();
		}
		s+="}";
		return s;
	}
}
