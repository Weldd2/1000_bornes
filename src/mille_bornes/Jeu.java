package mille_bornes;

import java.util.List;

public class Jeu {


	private final List<Joueur> joueurs; 
	private Joueur joueurActif; 
	private Joueur prochainJoueur; 
	private TasDeCartes sabot; 
	private TasDeCartes defausse; 

	public Jeu() {
		this.joueurs = null;
	}

	public Jeu(Joueur...joueurs) { 
		this.joueurs = null;
		for(Joueur j1: joueurs){
			this.joueurs.add(j1);
		}
		for(Joueur j2: joueurs){
			this.joueurs.add(j2);
		}
		for(Joueur j3: joueurs){
			this.joueurs.add(j3);
		}
		for(Joueur j4: joueurs){
			this.joueurs.add(j4);
		}
	}

	public void ajouteJoueurs(Joueur j1, Joueur j2, Joueur j3, Joueur j4) throws IllegalStateException {

	}

}
