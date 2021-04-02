package mille_bornes.cartes;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;

public abstract class Bataille extends Carte{

	
	public Bataille(String nom, Categorie categorie) {
		super(nom, categorie);
	}
	
	public boolean estContreeParFeuVert() {
		if (nom.equalsIgnoreCase("FeuRouge")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParFinDeLimite() {
		if (nom.equalsIgnoreCase("LimiteVitesse")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParEssence() {
		if (nom.equalsIgnoreCase("PanneEssence")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParRoueDeSecours() {
		if (nom.equalsIgnoreCase("Crevaison")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParReparations() {
		if (nom.equalsIgnoreCase("Accident")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParVehiculePrioritaire() {
		if (nom.equalsIgnoreCase("FeuRouge")) {
			return true;
		}
		if (nom.equalsIgnoreCase("LimiteVitesse")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParCiterne() {
		if (nom.equalsIgnoreCase("PanneEssence")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParIncrevable() {
		if (nom.equalsIgnoreCase("Crevaison")) {
			return true;
		}
		return false;
	}
	
	public boolean estContreeParAsDuVolant() {
		if (nom.equalsIgnoreCase("Accident")) {
			return true;
		}
		return false;
	}
	
	/*
	public abstract boolean contre​(Attaque carte) {
		
	}
	*/
	
	public void appliqueEffet​(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {
		
	}
}
