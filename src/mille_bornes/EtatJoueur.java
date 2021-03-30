package mille_bornes;

import java.util.*;

import mille_bornes.cartes.*;

public class EtatJoueur extends Object {

	
	private Joueur joueur;
	private int km;
	private final List<Botte> bottes;
	private boolean limiteVitesse;
	private List<Carte> main;
	private Stack<Bataille> pileBataille;
	


	public EtatJoueur(Joueur joueur) {
		this.bottes = new ArrayList<Botte>();
		this.joueur = joueur;
		this.km = 0;
		this.limiteVitesse = false;
		this.main = new ArrayList<Carte>();
		this.pileBataille = new Stack<Bataille>();
	}
	
	
	public int getKm() {
		return this.km;
	}
	
	public void ajouteKm​(int km) throws IllegalStateException {
		this.km = this.km + km;
	}
	
	/*
	public String ditPourquoiPeutPasAvancer() {
		//ajouter conditions
	}
	*/
	
	public boolean getLimiteVitesse() {
		return this.limiteVitesse;
	}
	
	public void setLimiteVitesse​(boolean limiteVitesse) {
		this.limiteVitesse = limiteVitesse;
	}
	
	/*
	public Bataille getBataille() {
		return pileBataille.lastIndexOf(pileBataille);
	}
	*/
	
	public void setBataille​(Bataille carte) {
		
	}
	
	public void defausseBataille​(Jeu jeu) {
		qfkhlsd;
	}
	
	/*
	 public List<Carte> getMain() {
	 } 
	 */
	
	

	public void addBotte​(Botte carte) {
		
	}
	
	public void attaque​(Jeu jeu, Attaque carte) throws IllegalStateException {
		
	}
	
	public String toString() {
		return (" ");
	}
	
	public void prendCarte​(Carte carte) throws IllegalStateException {
		
	}
	
	
	public void defausseCarte​(Jeu jeu, int numero) {
		
	}
	
	public void joueCarte​(Jeu jeu, int numero) throws IllegalStateException {
		
	}
	
	public void joueCarte​(Jeu jeu, int numero, Joueur adversaire) throws IllegalStateException {
		
	}
	
	/*
	 public List<Botte> getBottes() {
	 }
	 */
	
	public List<Carte> getMain() {
		return main;
	}
	
	
}










