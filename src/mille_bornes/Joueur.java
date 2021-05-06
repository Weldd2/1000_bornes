package mille_bornes;

import java.util.List;
import java.util.Scanner;

import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Bataille;
import mille_bornes.cartes.Botte;
import mille_bornes.cartes.Carte;

import java.util.ArrayList;
import java.util.Collections;

public class Joueur {

	public final String nom;
	private final EtatJoueur etat;
	private final Scanner input;
	private Joueur prochainJoueur;

	public Joueur(String nom) {
		this.nom = nom;
		this.etat = new EtatJoueur(this);
		this.prochainJoueur = null;
		input = new Scanner(System.in);
	}

	public Joueur getProchainJoueur() {
		return prochainJoueur;
	}

	public void setProchainJoueur(Joueur j) {
		this.prochainJoueur = j;
	}

	public List<Carte> getMain() {
		return etat.getMain();
	}

	public int getKm() {
		return etat.getKm();
	}

	public boolean getLimiteVitesse() {
		return etat.getLimiteVitesse();
	}

	public int choisitCarte() {
		int i = this.getMain().size();
		System.out.println("Joueur "+ this.nom +" vous avez "+i+" cartes en main");
		for (int j=0; j<i; j++) {
			System.out.println("-" + (j+1) + " " +this.getMain().get(j));
		}
		System.out.println("Quelle carte voulez vous choisir ? : ");
		int nb = input.nextInt();
		while (nb > 7 || nb < -7 || nb == 0) {
			System.out.println("Erreur, veuillez choisir à nouveau une carte");
			nb = input.nextInt();
		}
		return nb;
	}

	public Joueur choisitAdversaire(Carte carte) throws IllegalStateException {

		List<String> nomsJoueurs = new ArrayList<String>();
		List<Joueur> Joueurs = new ArrayList<Joueur>();
		Joueur joueurCible = prochainJoueur;
		System.out.println("Quel Joueur souhaitez vous cibler ?");
		System.out.println("Tapez \"retour\" pour revenir en arrière");

		while (joueurCible != this) {
			System.out.println(joueurCible);
			nomsJoueurs.add(joueurCible.nom);
			Joueurs.add(joueurCible);
			joueurCible = joueurCible.prochainJoueur;
		}

		String rep;
		rep = input.next();
		while (!nomsJoueurs.contains(rep) || rep.equalsIgnoreCase("Retour")) {
			System.out.println("Ce joueur n'existe pas ! Essaye encore");
			rep = input.next();
		}
		if (rep.equalsIgnoreCase("Retour")) {
			throw new IllegalStateException();
			
		}
		int j = nomsJoueurs.indexOf(rep);

		return Joueurs.get(j);

	}

	public void prendCarte(Carte carte) throws IllegalStateException {
		this.etat.prendCarte(carte);
	}

	public void joueCarte(Jeu jeu, int numero) throws IllegalStateException {
		this.etat.joueCarte(jeu, numero);
	}

	public void defausseCarte(Jeu jeu, int numero) {
		this.etat.defausseCarte(jeu, numero);
	}

	public void attaque(Jeu jeu, Attaque attaque) throws IllegalStateException {
		this.etat.attaque(jeu, attaque);
	}

	public void joueCarte(Jeu jeu, int numero, Joueur adversaire) throws IllegalStateException {
		this.etat.joueCarte(jeu, numero, adversaire);
	}

	public List<Botte> getBottes() {
		return Collections.unmodifiableList(getBottes());
	}

	public Bataille getBataille() {
		return this.etat.getBataille();

	}

	public String ditPourquoiPeutPasAvancer() {
		return this.etat.ditPourquoiPeutPasAvancer();
	}

	@Override
	public String toString() {
		return nom  + ", etat=" + etat+"\n";
	}

	
}