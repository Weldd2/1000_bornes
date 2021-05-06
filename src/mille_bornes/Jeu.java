package mille_bornes;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import mille_bornes.cartes.Carte;

public class Jeu {

	private final List<Joueur> joueurs = new LinkedList<>();
	private Joueur joueurActif;
	@SuppressWarnings("unused")
	private Joueur prochainJoueur;
	private TasDeCartes sabot;
	private TasDeCartes defausse;

	public Jeu() {
		this.sabot = new TasDeCartes(true);
		this.defausse = new TasDeCartes(false);
	}

	public Jeu(Joueur... joueur) {
		this.sabot = new TasDeCartes(true);
		this.defausse = new TasDeCartes(false);
		this.ajouteJoueurs(joueur);
	}

	public void ajouteJoueurs(Joueur... joueur) throws IllegalStateException {
		if (this.joueurActif != null)
			throw new IllegalStateException("Vous ne pouvez pas ajouter des joueurs si la partie est déjà commencée");
		if (this.joueurs.size() + joueur.length > 4)
			throw new IllegalStateException("Vous ne pouvez pas inscrire plus que 4 joueurs");
		this.joueurs.addAll(Arrays.asList(joueur));
	}

	public void prepareJeu() {
		Collections.shuffle(this.joueurs);
		this.sabot = new TasDeCartes(true);
		this.sabot.melangerCartes();
		this.defausse = new TasDeCartes(false);
		for (int i = 0; i < 6; i++) {
			for (Joueur j : this.joueurs) {
				j.prendCarte(this.pioche());
			}
		}
		joueurActif = ((LinkedList<Joueur>) this.joueurs).getFirst();
		for (Joueur j : this.joueurs) {
			j.setProchainJoueur(joueurs.get((this.joueurs.indexOf((j)) + 1) % joueurs.size()));
		}
		this.setProchainJoueur(joueurActif.getProchainJoueur());
		System.out.println("Ordre des joueurs :");

		for (Joueur j : this.joueurs) {
			System.out.print(j.getProchainJoueur().nom + " ");
		}
		System.out.println("\n");
	}

	public String toString() {
		StringBuilder entree = new StringBuilder(50);
		System.out.println("Etat de la partie :");
		for (Joueur j : this.joueurs) {
			entree.append(j.toString());
		}
		entree.append("Pioche : ").append(this.sabot.getNbCartes()).append("carte et défausse : ")
				.append(this.defausse.getNbCartes()).append("\n");
		return entree.toString();
	}

	public boolean joue() {
		if (estPartieFinie())
			return true;
		this.activeProchainJoueurEtTireCarte();
		System.out.println(this);
		boolean succes = false;
		while (!succes) {
			succes = true;
			int i = this.joueurActif.choisitCarte();
			if (i < 0)
				this.joueurActif.defausseCarte(this, (i * -1)-1);
			else {
				try {
					this.joueurActif.joueCarte(this, i - 1);
				} catch (IllegalStateException except) {
					except.printStackTrace();
					succes = false;
				}
			}
		}
		return estPartieFinie();
	}

	public void activeProchainJoueurEtTireCarte() {
		this.joueurActif = this.joueurActif.getProchainJoueur();
		this.setProchainJoueur(joueurActif.getProchainJoueur());
		this.joueurActif.prendCarte(this.pioche());
	}

	public boolean estPartieFinie() {
		if (this.sabot.estVide())
			return true;
		for (Joueur j : this.joueurs) {
			if (j.getKm() == 1000)
				return true;
		}
		return false;
	}

	public void setProchainJoueur(Joueur joueur) {
		this.prochainJoueur = joueur;
	}

	public Joueur getJoueurActif() {
		return joueurActif;
	}

	public List<Joueur> getGagnant() {
		List<Joueur> lesGagnants = joueurs;
		for (Joueur j1 : lesGagnants) {
			for (Joueur j2 : lesGagnants) {
				if (j1.getKm() < j2.getKm())
					lesGagnants.remove(j1);
			}
		}
		return lesGagnants;
	}

	public Carte pioche() {
		return this.sabot.prend();
	}

	public void defausse(Carte carte) {
		this.defausse.pose(carte);
	}

	public int getNbCartesSabot() {
		return this.sabot.getNbCartes();
	}

	public Carte regardeDefausse() {
		if (this.defausse.estVide())
			return null;
		return defausse.regarde();
	}
}