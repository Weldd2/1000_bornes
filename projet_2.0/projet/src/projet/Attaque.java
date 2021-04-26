package projet;

public abstract class Attaque extends Bataille {

	
	public Attaque(String nom) {
		super(nom, Categorie.Attaque);
	}
	
	
	
	public boolean contre​(Attaque carte) {
		return false;
	}
	
	
	public void appliqueEffet(Jeu jeu, EtatJoueur joueur) throws IllegalStateException {
		
	}
	
}