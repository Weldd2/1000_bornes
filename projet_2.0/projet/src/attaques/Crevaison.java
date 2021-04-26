package attaques;

import projet.Attaque;
import projet.EtatJoueur;
import projet.Jeu;

public class Crevaison extends Attaque {
	
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
