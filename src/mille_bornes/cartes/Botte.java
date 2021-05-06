package mille_bornes.cartes;

public abstract class Botte extends Carte {



	public Botte(String nom) {
		super(nom, Categorie.Botte);
	}

	public abstract boolean contre(Attaque carte);

}
