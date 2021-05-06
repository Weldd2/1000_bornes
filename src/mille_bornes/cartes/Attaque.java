package mille_bornes.cartes;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;

public abstract class Attaque extends Bataille {

	public Attaque(String nom) {
		super(nom, Categorie.Attaque);
	}

	public boolean contre​(Attaque carte) {
		return false;
	}

	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {
		if (joueur.getBataille() == null) {
			joueur.setBataille(this);
			System.out.println(jeu.getJoueurActif().nom + " a attaqué " + joueur.getNomJoueur() + " avec " + this.nom);
		} else {
			if (joueur.getBataille().categorie == Categorie.Attaque) {
				throw new IllegalStateException("Le joueur est déjà affecté par une attaque");
			} else {
				joueur.setBataille(this);
				System.out
						.println(jeu.getJoueurActif().nom + " a attaqué " + joueur.getNomJoueur() + " avec " + this.nom);
			}
		}
	}
}
