package model;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	private String nom;
	private List<Personne> personnes = new ArrayList();
	
	public Entreprise(String nom, List<Personne> personnes) {
		this.nom = nom;
		this.personnes = personnes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public String toString() {
		return "Entreprise [nom=" + nom + ", personnes=" + personnes + "]";
	} 
	
	
	
}
