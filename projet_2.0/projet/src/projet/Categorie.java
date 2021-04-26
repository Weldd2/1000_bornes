package projet;

public enum Categorie { 
    
    Attaque, 
    Parade, 
    Botte, 
    Borne; 
    
    private Categorie () {
        
    }
    
    @SuppressWarnings("unused")
    private static final Categorie[] values = new Categorie[] { Attaque, Parade, Botte, Borne };
    
    public static Categorie categorie[] = Categorie.values(); { 
    for (Categorie c : Categorie.values())
        System.out.println(c);
    }
    

    
    public static Categorie valueOf​(String name)
    {
        for (int i = 0; i < values.length; i++) {
            if (values[i].name().equals(name)) {
                return values[i];
            }
        }
      return null;
    }
}