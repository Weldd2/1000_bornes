package mille_bornes.cartes.attaques;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;

public class Accident extends Attaque {

	public Accident() {
		super("Accident");
	}

	public boolean estContreeParAsDuVolant() {
		return true;
	}
	
	public boolean estContreeParReparations() {
		return true;
	}
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {}
	
}
