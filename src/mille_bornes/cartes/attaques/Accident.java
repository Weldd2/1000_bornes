package mille_bornes.cartes.attaques;

import mille_bornes.cartes.Attaque;

public class Accident extends Attaque {

	public Accident() {
		super("Accident");
	}

	public boolean estContreeParAsDuVolant() {
		return true;
	}

	public boolean estContreeParReparations() {
		return true;
	}

	public boolean contre(Attaque carte) {
		return false;
	}

}
