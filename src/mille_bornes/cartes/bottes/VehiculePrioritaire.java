package mille_bornes.cartes.bottes;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Botte;

public class VehiculePrioritaire extends Botte {

	public VehiculePrioritaire() {
		super("VehiculePrioritaire");
	}

	public boolean contre(Attaque carte) {
		return carte.nom.equals("LimiteVitesse") ? true : (carte.nom.equals("FeuRouge"));
	}

	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) {

	}
}
