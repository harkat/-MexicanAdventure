import java.util.Random;
/**
 * Represente tout type d'objet
 * present dans une carte
 *
 * @author  Groupe 6
 * @version V2.0
 */
public abstract class Objet
{
    /**
     * le nom de l'objet
     */
    protected String nom;
    /**
     * les points appotes au personnage
     */
    protected int points;
    /**
     * pour generer des valeurs aleatoires
     */
    private static final Random RAND = Randomizer.getRandom();

    /**
     * cree un objet
     * @param pts les points appotes
     */
    protected Objet(int pts) {
        this.nom = genererNom();
        this.points = pts;
    }
    
    /**
     * methode genere le nom d'un Objet
     * @return nom le nom de l'objet
     */
    private String genererNom() {
        String nm = "";
        int tag = RAND.nextInt(5) + 1;
        
        if (this instanceof Relique) {
            switch(tag) {
                case 1 :
                    nom = "medaillon";
                    break;
                case 2 :
                    nom = "croix";
                    break;
                case 3 :
                    nom = "sceptre";
                    break;
                case 4 :
                    nom = "montre";
                    break;
                case 5 :
                    nom = "bague";
                    break;  
            }
        }
        else if (this instanceof Nourriture) {
            switch(tag) {
                case 1 :
                    nom = "taco";
                    break;
                case 2 :
                    nom = "soushi";
                    break;
                case 3 :
                    nom = "kebab";
                    break;
                case 4 :
                    nom = "hamburger";
                    break;
                case 5 :
                    nom = "hot-dog";
                    break;
            }
        }
        else if (this instanceof Instrument) {
            switch(tag) {
                case 1 :
                    nom = "guitar";
                    break;
                case 2 :
                    nom = "fouet";
                    break;
                case 3 :
                    nom = "sombrero";
                    break;
                case 4 :
                    nom = "poison";
                    break;
                case 5 :
                    nom = "couteau";
                    break;
            }
        }
        return nm;
    }
}