package mille_bornes;

import java.util.*;

import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Bataille;
import mille_bornes.cartes.Botte;
import mille_bornes.cartes.Carte;
import mille_bornes.cartes.Categorie;
import mille_bornes.cartes.attaques.LimiteVitesse;

public class EtatJoueur {

	@SuppressWarnings("unused")
	private final Joueur joueur;
	private final Stack<Bataille> pileBataille;
	private final List<Carte> main;
	private int km;
	private final List<Botte> bottes;
	private boolean limiteVitesse;

	public EtatJoueur(Joueur joueur) {
		this.bottes = new LinkedList<>();
		this.main = new LinkedList<>();
		this.pileBataille = new Stack<>();
		this.joueur = joueur;
	}

	public int getKm() {
		return this.km;
	}

	public void ajouteKm(int km) throws IllegalStateException {
		this.km = this.km + km;
	}

	public String ditPourquoiPeutPasAvancer() {
		if (this.pileBataille.peek() instanceof LimiteVitesse) {
			return null;
		}
		if (this.pileBataille.peek() instanceof Attaque) {
			return "vous ne pouvez avancer il y a déjà une attque sur le dessus de la pile : "
					+ this.pileBataille.peek().toString();
		}
		if (this.pileBataille.empty())
			return "Il vous faut un feux vert sur votre pile sorry ";
		return null;
	}

	public boolean getLimiteVitesse() {
		return this.limiteVitesse;
	}

	public void setLimiteVitesse(boolean limiteVitesse) {
		this.limiteVitesse = limiteVitesse;
	}

	
	public Bataille getBataille() {
		if (pileBataille.isEmpty()) {
			return null;
		}
		return pileBataille.lastElement();
	}


	public void setBataille(Bataille carte) {
		pileBataille.add(carte);
	}

	public void defausseBataille(Jeu jeu) {
		jeu.defausse(this.pileBataille.peek());
		this.pileBataille.pop();
	}

	public List<Carte> getMain() {
		return Collections.unmodifiableList(main);
	}

	public void addBotte(Botte carte) {
		bottes.add(1, carte);
	}

	public void attaque(Jeu jeu, Attaque carte) throws IllegalStateException {
		carte.appliqueEffet(jeu, this);
	}

	public String toString() {
		StringBuilder retour = new StringBuilder(this.km + "km ");
		if (this.limiteVitesse)
			retour.append("(50)");
		else
			retour.append("(200) ");
		if (this.pileBataille.empty())
			retour.append("Pile Bataille vide");
		else
			retour.append(this.pileBataille.peek().toString());
		return retour.toString();
	}

	public void prendCarte(Carte carte) throws IllegalStateException {
		//main.add(carte);
		if (7 < main.size()) {
			throw new IllegalStateException("oups vous avez déjà 7 cartes en main");
		} else
			this.main.add(carte);
	}

	public void defausseCarte(Jeu jeu, int numero) {
		jeu.defausse(this.main.get(numero));
		this.main.remove(numero);
	}

	public void joueCarte(Jeu jeu, int numero, Joueur adversaire) throws IllegalStateException {
		adversaire.attaque(jeu, (Attaque) this.main.get(numero));
		this.main.remove(numero);
	}

	public void joueCarte(Jeu jeu, int numero) throws IllegalStateException {
		if (this.main.get(numero).categorie == Categorie.Attaque)
			this.joueCarte(jeu, numero, (Joueur) jeu.getJoueurActif().choisitAdversaire(this.main.get(numero)));
		else {
			this.main.get(numero).appliqueEffet(jeu, this);
			this.main.remove(numero);
		}
	}

	public List<Botte> getBottes() {
		return Collections.unmodifiableList(bottes);
	}
	
	public String getNomJoueur () {
		return this.joueur.nom;
	}
}