package mille_bornes.cartes.attaques;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;

public class FeuRouge extends Attaque{

	public FeuRouge() {
		super("FeuRouge");
	}
	
	public boolean estContreeParFeuVert() {
		return true;
	}
	
	public boolean estContreeParVehiculePrioritaire() {
		return true;
	}
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {}
}
