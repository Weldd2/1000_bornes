package attaques;

import projet.Attaque;
import projet.EtatJoueur;
import projet.Jeu;

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
