package mille_bornes.cartes.parades;

import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Parade;

public class FeuVert extends Parade {

	public FeuVert() {
		super("FeuVert");
	}

	public boolean contre(Attaque carte) {
		return carte.nom.equals("FeuRouge");

	}
}
