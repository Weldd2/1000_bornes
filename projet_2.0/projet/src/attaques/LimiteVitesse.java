package attaques;

import projet.Attaque;
import projet.EtatJoueur;
import projet.Jeu;

public class LimiteVitesse extends Attaque {

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
