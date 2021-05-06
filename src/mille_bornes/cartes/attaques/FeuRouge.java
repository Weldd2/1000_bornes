package mille_bornes.cartes.attaques;

import mille_bornes.cartes.Attaque;

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

	public boolean contre(Attaque carte) {
		return false;
	}
}
