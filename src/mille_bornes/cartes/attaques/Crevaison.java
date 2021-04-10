package mille_bornes.cartes.attaques;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;

public class Crevaison extends Attaque{
	
	public Crevaison() {
		super("Crevaison");
	}
	
	public boolean estContreeParIncrevable() {
		return true;
	}
	
	public boolean estContreeParRoueDeSecours() {
		return true;
	}
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {}
}
