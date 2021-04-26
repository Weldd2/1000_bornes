package projet;

import java.util.ArrayList;
import java.util.Collections;
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

	public void ajouteKm (int km) throws IllegalStateException {
		this.km = this.km+km;
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

	public boolean getLimiteVitesse() {
		return limiteVitesse;
	}

	public void setLimiteVitesse(boolean limiteVitesse) {
		this.limiteVitesse = limiteVitesse;
	}



	public Bataille getBataille() {
		return pileBataille.peek();
	}

	public void setBataille​(Bataille carte) {
		pileBataille.add(1, carte); 
	}


	public void defausseBataille​(Jeu jeu) {
		pileBataille.remove(1);
		// comprends pas  
		// defausse.Jeu.remove(1);
	}

	public List<Carte> getMain() {
		return Collections.unmodifiableList(main);
	} 

	public void addBotte​(Botte carte) {
		// .add(1, carte);
	}

	public void attaque​(Jeu jeu, Attaque carte) throws IllegalStateException {

	}

	public String toString() {

	}

	public void prendCarte​(Carte carte) throws IllegalStateException {
		main.add(carte); 
		if (6 < main.size()) {
			throw new IllegalStateException(); 
		}
	}

	public void defausseCarte​(Jeu jeu, int numero) {
		jeu.defausse(this.main.get(numero));
		this.main.remove(numero);
	}


	public void joueCarte(Jeu jeu, int numero) throws IllegalStateException{
		if(this.main.get(numero) instanceof Attaque){
			this.joueCarte(jeu,numero,jeu.getJoueurActif().choisitAdversaire(this.main.get(numero)));
		}
	}


public void joueCarte​(Jeu jeu, int numero, Joueur adversaire) throws IllegalStateException {

}
public List<Botte> getBottes() {
	return Collections.unmodifiableList(bottes);
}






}
