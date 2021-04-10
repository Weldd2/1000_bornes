package mille_bornes.cartes.attaques;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;

public class PanneEssence extends Attaque{

	public PanneEssence() {
		super("PanneEssence");
	}
	
	public boolean estContreeParCiterne() {
		return true;
	}
	
	public boolean estContreeParEssence() {
		return true;
	}
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {}
}
