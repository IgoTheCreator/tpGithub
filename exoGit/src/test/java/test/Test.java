package test;

import java.util.ArrayList;
import java.util.List;

import model.Entreprise;
import model.Personne;

public class Test {
	
	public static void main(String[] args) {

	Personne p1 = new Personne ("Dupond", "Jean");
	Personne p2 = new Personne ("Titi", "Toto");
	
	List<Personne> personnes = new ArrayList();
	
	personnes.add(p1);
	personnes.add(p2);
	
	Entreprise e1 = new Entreprise("Sopra", personnes);
	
	System.out.println(e1);
	}
}
