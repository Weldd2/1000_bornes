package mille_bornes.cartes;

import mille_bornes.Jeu;
import mille_bornes.EtatJoueur;

public class Borne extends Carte{

	
	public final int km;
	
	public Borne(int km) {
		super(String.valueOf(km), Categorie.Borne);
		this.km = km;
	}
	

	@Override
	public void appliqueEffet(Jeu jeu, EtatJoueur etatJoueur) throws IllegalStateException {
		etatJoueur.ajouteKm(this.km);
		System.out.println("Joueur " + jeu.getJoueurActif().nom + " vous avez ajouté " + this.km + "km à votre compteur");
	}
	

	
}
