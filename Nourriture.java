
/**
 * Represente les objets de type Nourriture
 *
 * @author  Groupe 6
 * @version V2.0
 */
public class Nourriture extends Objet
{
    // a remplacer plutard par une table associative
    /**
     * energie l'energie donnee au personnage
     */
    private int energie;
    /**
     * cree une nourriture
     */
    public Nourriture() {
        super();
        switch(this.nom) {
            case "taco" :
                this.energie = 10;
                break;
            case "soushi" :
                this.energie = 6;
                break;
            case "kebab" :
                this.energie = 8;
                break;
            case "hamburger" :
                this.energie = 7;
                break;
            case "hot-dog" :
                this.energie = 5;
                break;  
        }
    }
    
    public int getEnergie() {
        return this.energie;
    }
}

