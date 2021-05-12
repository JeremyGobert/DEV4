package be.ehb.multec.data;

public class Repositories {
    private static final AuteurRepository AUTEUR_REPO = new MySqlAuteurRepository();
    private static final BoekRepository BOEK_REPO = new MySqlBoekRepository();
    
    
    
    private Repositories() { }

    public static AuteurRepository getAuteurRepository() {
        return AUTEUR_REPO;
    }
    public static BoekRepository getBoekRepository() {
        return BOEK_REPO;
    }
    
}
