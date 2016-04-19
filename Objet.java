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
        int tagNI = RAND.nextInt(5) + 1;
        
        if (this instanceof Relique) {
            switch(tag) {
                case 1 :
                    nom    = "medaillon";
                    points = 1000;
                    break;
                case 2 :
                    nom    = "croix";
                    points = 400;
                    break;
                case 3 :
                    nom    = "sceptre";
                    points = 1500;
                    break;
                case 4 :
                    nom    = "montre";
                    points = 800;
                    break;
                case 5 :
                    nom    = "bague";
                    points = 1200;
                    break;
                case 6 :
                    nom    = "coffret";
                    points = 1100;
                    break; 
                case 7 :
                    nom    = "livre";
                    points = 1300;
                    break; 
            }
        }
        else if (this instanceof Nourriture) {
            points = 0;
            switch(tagNI) {
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
            switch(tagNI) {
                case 1 :
                    nom    = "guitar";
                    points = 90;
                    break;
                case 2 :
                    nom    = "fouet";
                    points = 70;
                    break;
                case 3 :
                    nom    = "sombrero";
                    points = 60;
                    break;
                case 4 :
                    nom    = "poison";
                    points = 40;
                    break;
                case 5 :
                    nom    = "couteau";
                    points = 80;
                    break;
            }
        }

    }
}