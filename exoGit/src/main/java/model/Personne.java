// Commentaire Nicolas
package model;

public class Personne {

	private String prenom;
	private String nom;
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
}
