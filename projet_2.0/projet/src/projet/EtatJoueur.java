package projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import attaques.LimiteVitesse;

public class EtatJoueur {

	private final Joueur joueur;
	private final Stack<Bataille> pileBataille;
	private final List<Carte> main; 
	private int km;
	private final List<Botte> bottes;
	private boolean limiteVitesse; 

	public EtatJoueur(Joueur joueur) {
		this.bottes = new ArrayList<Botte>();
		this.joueur = joueur;
		this.km = 0;
		this.limiteVitesse = false;
		this.main = new ArrayList<Carte>();
		this.pileBataille = new Stack<Bataille>();
	}

	public int getKm() {
		return km;
	}

	public boolean getLimiteVitesse() {
		return limiteVitesse;
	}

	public void setLimiteVitesse(boolean limiteVitesse) {
		this.limiteVitesse = limiteVitesse;
	}

	public String ditPourquoiPeutPasAvancer(){
		if(this.pileBataille.peek() instanceof LimiteVitesse){
			return null;
		}
		if(this.pileBataille.peek() instanceof Attaque){
			return "vous ne pouvez avancer car une attaque est posée sur votre pile bataille :" + this.pileBataille.peek().toString();
		}
		if(this.pileBataille.empty()) return "vous ne pouvez avancer sans poser un feu vert sur votre pile de bataille";
		return null;
	}

	public Bataille getBataille() {
		return getBataille();
	}

	public void setBataille​(Bataille carte) {
		pileBataille.add(carte); 
	}

	public List<Botte> getBottes() {
		return bottes;
	}

	public void defausseBataille​(Jeu jeu) {
		pileBataille.remove(1);
		// Jeu.defausse.remove(1);
	}

	public List<Carte> getMain() {
		return main;
	} 

	public void addBotte​(Botte carte) {
		// add(carte); 
	}

	public void attaque​(Jeu jeu, Attaque carte) throws IllegalStateException {

	}

	public void prendCarte​(Carte carte) throws IllegalStateException {
		main.add(carte); 
		if (6 < main.size()) {
			throw new IllegalStateException(); 
		}
	}
	
	public void defausseCarte​(Jeu jeu, int numero) {
		
	}
	
	public void joueCarte​(Jeu jeu, int numero, Joueur adversaire) throws IllegalStateException {
		
	}

	




}
