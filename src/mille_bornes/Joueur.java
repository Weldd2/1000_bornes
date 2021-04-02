package mille_bornes;

import java.util.List;
import java.util.Scanner;

import mille_bornes.cartes.Attaque;
import mille_bornes.cartes.Bataille;
import mille_bornes.cartes.Carte;

public class Joueur extends Object {

	public final String nom;
	private final EtatJoueur etat;
	private Joueur prochainJoueur;
	private final Scanner input;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.etat = new EtatJoueur(this);
		this.prochainJoueur = null;
		input = new Scanner(System.in);
	}
	
	public Joueur getProchainJoueur() {
		return prochainJoueur;
	}
	
	public void setProchainJoueur​(Joueur j) {
		this.prochainJoueur = j;
	}
	
	public List<Carte> getMain() {
		return etat.getMain();
	}
	
	public int getKm() {
		return etat.getKm();
	}
	
	public boolean getLimiteVitesse () {
		return etat.getLimiteVitesse();
	}
	
	/*
	public int choisitCarte() {
		int x;
		x = input.nextInt();
		if ()
	}
	*/
	/*
	
	public Joueur choisitAdversaire​(Carte carte) throws IllegalStateException {
	}
	
	
	public void prendCarte​(Carte carte) throws IllegalStateException {
	}
	
	public void joueCarte​(Jeu jeu, int numero) throws IllegalStateException {
	}
	
	public void defausseCarte​(Jeu jeu, int numero) {
	
	}
	
	public void attaque​(Jeu jeu, Attaque carte) throws IllegalStateException {
	}
	
	public void joueCarte​(Jeu jeu, int numero, Joueur adversaire) throws IllegalStateException {
	}
	
	public Bataille getBataille() {
	}
	
	public String ditPourquoiPeutPasAvancer() {
	}
	
	*/
	
	public String toString() {
		return (this.nom + "");
	}
	
}
