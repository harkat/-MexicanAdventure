
/**
 * Abstract class Adverssaire - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Adverssaire implements Personnage
{
    /**
     * le nom du Personnage
     * de type chaine de caracteres 
     */
    private String nom;
    /**
     * les points de vie du Personnage
     * de type reel 
     */
    protected double ptsVie;
    /**
     * constructeur initialise avec les parametres
     * @param n nom du Personnage cree
     * @param pv points de vie du Personnage cree
     */
    public Adverssaire(String n, double pv) {
        this.ptsVie = pv;
        if (n == null) {
            this.nom = "dark vador";
        }
        else {
            this.nom = n;
        }
    }
}
