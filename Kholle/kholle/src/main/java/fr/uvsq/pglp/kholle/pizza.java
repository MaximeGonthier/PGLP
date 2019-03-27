package fr.uvsq.pglp.kholle;

import java.awt.List;
import java.util.ArrayList;

public class pizza implements moza {
	private String nom;
	private String sauce;
	
	public pizza(String nom, String sauce) {
		this.nom=nom;
		this.sauce=sauce;
	}
	
	public static class Builder{
		private final String nom;
		private String sauce;
		
		public Builder(String nom){
			this.nom=nom;
		}
		
		public Builder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		public pizza build(){
			return new pizza(this);
		}
	
	}
	
	private pizza(Builder builder){
		nom=builder.nom;

		sauce = builder.sauce;
	}


	public String getNom() {
		return nom;
	}

	public String getSauce() {
		return sauce;
	}

	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
}
