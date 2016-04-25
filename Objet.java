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
     */
    protected Objet() {
        genererObjet();
    }
    
    /**
     * methode genere le nom d'un Objet
     */
    private void genererObjet() {
        int tag = RAND.nextInt(7) + 1;
        int tagI = RAND.nextInt(5) + 1;
        
        if (this instanceof Relique) {
            switch(tag) {
                case 1 :
                    nom    = "le medaillon ancestral";
                    points = 1000;
                    break;
                case 2 :
                    nom    = "la croix rouillé";
                    points = 400;
                    break;
                case 3 :
                    nom    = "le sceptre sacré";
                    points = 1500;
                    break;
                case 4 :
                    nom    = "la montre temporelle";
                    points = 800;
                    break;
                case 5 :
                    nom    = "la bague magique";
                    points = 1200;
                    break;
                case 6 :
                    nom    = "le coffret de pandore";
                    points = 1100;
                    break; 
                case 7 :
                    nom    = "le livre de magie";
                    points = 1300;
                    break; 
            }
        }
        else if (this instanceof Nourriture) {
            points = 0;
            switch(tag) {
                case 1 :
                    nom = "un tacos";
                    break;
                case 2 :
                    nom = "un soushi";
                    break;
                case 3 :
                    nom = "un kebab";
                    break;
                case 4 :
                    nom = "un hamburger";
                    break;
                case 5 :
                    nom = "un hot-dog";
                    break;
                case 6 :
                    nom = "un panini";
                    break;
                case 7 :
                    nom = "une pizza";
                    break;
            }
        }
        else if (this instanceof Instrument) {
            switch(tagI) {
                case 1 :
                    nom    = "une guitar";
                    points = 90;
                    break;
                case 2 :
                    nom    = "un fouet";
                    points = 70;
                    break;
                case 3 :
                    nom    = "un sombrero";
                    points = 60;
                    break;
                case 4 :
                    nom    = "un poison";
                    points = 40;
                    break;
                case 5 :
                    nom    = "un couteau";
                    points = 80;
                    break;
            }
        }

    }
    
    /**
     * accesseur nom
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
     * accesseur points
     * @return points
     */
    public int getPoints() {
        return this.points;
    }
}