package projet;

import java.util.*;

public class TasDeCartes {

	private final List<Carte> cartes;

	public TasDeCartes (boolean creerLesCartes) {
		
	}

	@SuppressWarnings("unused")
	private void creerLesCartes() {
		Collections.addAll(cartes); 
	}
	
	public void melangerCartes() {
		Collections.shuffle(cartes); 
	}


	public int getNbCartes() {
		return cartes.size();
	}

	public boolean estVide() {
		return cartes.isEmpty();
	}
	
	public Carte regarde() {
		return cartes.get(1); 
	}

	public Carte prend() {
        if (cartes.isEmpty()) return null;
        cartes.remove(1); 
		return cartes.get(1); 
	}

	public void pose​(Carte carte) {
		cartes.add(1, carte);
	}
}
