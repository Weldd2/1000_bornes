package projet;

import java.util.List;
import java.util.Scanner;

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





}
