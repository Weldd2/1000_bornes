package mille_bornes.cartes.attaques;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;

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

	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {
		if (joueur.getLimiteVitesse()) {
			throw new IllegalStateException("Le joueur est dejà limité");
		} else {
			joueur.setLimiteVitesse(true);
			System.out.println(jeu.getJoueurActif().nom + " a attaqué " + joueur.getNomJoueur() + " avec une limite de vitesse");
		}
	}

	public boolean contre(Attaque carte) {
		return false;
	}

}
