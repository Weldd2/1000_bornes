package mille_bornes.cartes.bottes;

import mille_bornes.EtatJoueur;
import mille_bornes.Jeu;
import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Botte;

public class Citerne extends Botte{

	public Citerne() {
		super("Citerne");
	}
	
	public boolean contre (Attaque carte){
		return carte.nom.equals("PanneEssence");
	}
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) {
		
	}

}
