package mille_bornes;

import java.util.*;

import mille_bornes.cartes.Carte;
import mille_bornes.cartes.attaques.*;
import mille_bornes.cartes.bottes.*;
import mille_bornes.cartes.parades.*;
import mille_bornes.cartes.Borne;

public class TasDeCartes {

	private final List<Carte> cartes = new ArrayList<Carte>();

	public TasDeCartes(boolean creerLesCartes) {
		if (creerLesCartes == true) {
			creerLesCartes();
		} else {
		}
	}

	private void creerLesCartes() {
		int i;
		this.cartes.add(new VehiculePrioritaire());
		this.cartes.add(new Citerne());
		this.cartes.add(new Increvable());
		this.cartes.add(new AsDuVolant());
		for (i = 0; i < 3; i++) {
			this.cartes.add(new Accident());
			this.cartes.add(new Crevaison());
			this.cartes.add(new PanneEssence());
		}
		for (i = 0; i < 10; i++) {
			this.cartes.add(new Borne(25));
			this.cartes.add(new Borne(50));
			this.cartes.add(new Borne(75));
		}
		for (i = 0; i < 4; i++) {
			this.cartes.add(new LimiteVitesse());
			this.cartes.add(new Borne(200));
		}
		for (i = 0; i < 5; i++) {
			this.cartes.add(new FeuRouge());
		}
		for (i = 0; i < 6; i++) {
			this.cartes.add(new FinDeLimite());
			this.cartes.add(new Essence());
			this.cartes.add(new RoueDeSecours());
			this.cartes.add(new Reparation());
		}
		for (i = 0; i < 12; i++) {
			this.cartes.add(new Borne(100));
		}
		for (i = 0; i < 14; i++) {
			this.cartes.add(new FeuVert());
		}
		melangerCartes();

	}

	public void melangerCartes() {
		Collections.shuffle(cartes);
	}

	public int getNbCartes() {
		return cartes.size();
	}

	public boolean estVide() {
		return cartes.isEmpty();
	}

	public Carte regarde() {
		return cartes.get(1);
	}

	public Carte prend() {
		if (cartes.isEmpty())
			return null;
		Carte carte;
		carte = cartes.get(1);
		cartes.remove(1);
		return carte;
	}

	public void pose(Carte carte) {
		cartes.add(carte);
	}
}