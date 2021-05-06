package mille_bornes.cartes;

import mille_bornes.*;

public abstract class Carte extends Object {

	public final String nom;
	public final Categorie categorie;

	public Carte(String nom, Categorie categorie) {
		this.nom = nom;
		this.categorie = categorie;
	}

	public abstract void appliqueEffet(Jeu jeu, EtatJoueur etatJoueur) throws IllegalStateException;

	// @override toString in class Object
	public String toString() {
		String carte = new String("La carte " + this.nom + " est de type " + this.categorie);
		return carte;
	}

}