package mille_bornes.cartes;

public enum Categorie {

	Attaque, Parade, Botte, Borne;

	private Categorie() {

	}

	public static Categorie[] values = new Categorie[] { Attaque, Parade, Botte, Borne };
	
	/*public static Categorie[] values() {
		for (Categorie c : Categorie.values())
			System.out.println(c);
		return values;
	}*/

	public static Categorie valueOf​(String name) {
		for (int i = 0; i < values.length; i++) {
			if (values[i].name().equals(name)) {
				return values[i];
			}
		}
		return null;
	}
}