package attaques;

import projet.Attaque;
import projet.EtatJoueur;
import projet.Jeu;

public class FeuRouge extends Attaque {

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