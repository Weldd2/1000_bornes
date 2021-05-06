package mille_bornes.cartes.attaques;

import mille_bornes.cartes.Attaque;

public class PanneEssence extends Attaque {

	public PanneEssence() {
		super("PanneEssence");
	}

	public boolean estContreeParCiterne() {
		return true;
	}

	public boolean estContreeParEssence() {
		return true;
	}

	public boolean contre(Attaque carte) {
		return false;
	}
}
