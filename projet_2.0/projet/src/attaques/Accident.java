package attaques;

import projet.Attaque;

public class Accident extends Attaque{

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
