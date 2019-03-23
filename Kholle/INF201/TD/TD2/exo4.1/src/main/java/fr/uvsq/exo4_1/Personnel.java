package fr.uvsq.exo4_1;

import java.time.LocalDate;

public final class Personnel implements Element{
	private final String nom;
	private final String prenom;
	private final LocalDate dateNaissance;
	private final int telephone;
	private final String fonction;
	
	public static class Builder{
		//required parameters
		private final String nom;
		private final String prenom;
		// optional parameters initialize with default values
		private LocalDate dateNaissance=LocalDate.of(2000, 1, 1);
		private int telephone=0102030405;
		private String fonction="Stagiaire";

		public Builder(String nom, String prenom){
			this.nom=nom;
			this.prenom=prenom;
		}
		
		public Builder dateNaissance(LocalDate dateNaissance) {
			this.dateNaissance=dateNaissance;
			return this;
		}
		
		public Builder telephone(int telephone) {
			this.telephone=telephone;
			return this;
		}
		
		public Builder fonction(String fonction) {
			this.fonction=fonction;
			return this;
		}
		
		public Personnel build(){
			return new Personnel(this);
		}
	}
	
	private Personnel(Builder builder){
		//required parameters
		nom=builder.nom;
		prenom=builder.prenom;

		//optional parameters
		dateNaissance=builder.dateNaissance;
		telephone=builder.telephone;
		fonction=builder.fonction;
	}
	
	@Override
	public String affiche() {
		String s= "["+nom+", "+prenom+", "+dateNaissance+", "+telephone+", "+fonction+"]";
		return s;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public int getTelephone() {
		return telephone;
	}

	public String getFonction() {
		return fonction;
	}
}
