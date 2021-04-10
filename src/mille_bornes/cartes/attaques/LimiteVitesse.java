package mille_bornes.cartes.attaques;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;

public class LimiteVitesse extends Attaque{

	public LimiteVitesse() {
		super("LimiteVitesse");
	}
	
	public boolean estContreeParFinDeLimite() {
		return true;
	}
	
	public boolean estContreeParVehiculePrioritaire() {
		return true;
	}
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {}
}
