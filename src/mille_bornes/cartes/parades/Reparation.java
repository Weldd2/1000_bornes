package mille_bornes.cartes.parades;

import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Parade;

public class Reparation extends Parade {

	public Reparation() {
		super("Reparation");
	}

	public boolean contre(Attaque carte) {
		return carte.nom.equals("Accident");

	}
}
