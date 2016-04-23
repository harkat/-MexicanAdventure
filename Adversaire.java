import java.util.Random;
/**
 * Abstract class Adversaire - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Adversaire implements Personnage
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
     * pour generer des valeurs aleatoires
     */
    private static final Random RAND = Randomizer.getRandom();
    
    /**
     * constructeur initialise avec les parametres
     * @param pv points de vie du Personnage cree
     */
    public Adversaire(double pv) {
        this.ptsVie = pv;
        this.nom = genererNom();
    }
    
    /**
     * methode genere le nom d'un Adversaire
     * @return nom le nom de l'objet
     */
    private String genererNom() {
        String nm = "";
        int tag = RAND.nextInt(5) + 1;
        
        if (this instanceof Catcheur) {
            switch(tag) {
                case 1 :
                    nom = "L'ourse";
                    break;
                case 2 :
                    nom = "Le parfeu";
                    break;
                case 3 :
                    nom = "L'araignee";
                    break;
                case 4 :
                    nom = "Le tigre";
                    break;
                case 5 :
                    nom = "Le bourreau";
                    break;  
            }
        }
        else if (this instanceof Monstre) {
            switch(tag) {
                case 1 :
                    nom = "Dark vador";
                    break;
                case 2 :
                    nom = "Hulk";
                    break;
                case 3 :
                    nom = "Goro";
                    break;
                case 4 :
                    nom = "Doubleface";
                    break;
                case 5 :
                    nom = "Le fou";
                    break;
            }
        }
        return nm;
    }
}
