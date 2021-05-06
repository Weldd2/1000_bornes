package mille_bornes.cartes.parades;

import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Parade;

public class RoueDeSecours extends Parade {

	public RoueDeSecours() {
		super("RoueDeSecours");
	}

	public boolean contre(Attaque carte) {
		return carte.nom.equals("Crevaison");

	}
}
