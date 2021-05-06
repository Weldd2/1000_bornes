package mille_bornes;

public class Main {

	public static void main(String[] args) {

		
		Joueur j1 = new Joueur("toto");
		Joueur j2 = new Joueur("tota");
		Joueur j3 = new Joueur("toti");
		Joueur j4 = new Joueur("totu");

		Jeu jeu = new Jeu(j1, j2, j3, j4);
		jeu.prepareJeu();

		while (!jeu.joue()) {
			jeu.joue();
		}

	}

}
