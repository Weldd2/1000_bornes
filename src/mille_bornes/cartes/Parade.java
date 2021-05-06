package mille_bornes.cartes;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;

public abstract class Parade extends Bataille {

	public Parade(String nom) {
		super(nom, Categorie.Parade);
	}

	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {
		if (joueur.getBataille().categorie == Categorie.Parade) {
			throw new IllegalStateException("Vous n'êtes pas sous l'effet d'une attaque");
		}
		else {
			joueur.setBataille(this);
		}
	}
}
