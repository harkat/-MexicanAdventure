
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
    private double energie;
    /**
     * cree une nourriture
     */
    public Nourriture() {
        super();
        switch(this.nom) {
            case "un tacos" :
                this.energie = 6;
                break;
            case "un soushi" :
                this.energie = 4;
                break;
            case "un kebab" :
                this.energie = 5;
                break;
            case "un hamburger" :
                this.energie = 4;
                break;
            case "un hot-dog" :
                this.energie = 3;
                break;
            case "un panini" :
                this.energie = 5;
                break;
            case "une pizza" :
                this.energie = 4;
                break;
        }
    }
    
    /**
     * accesseur energie
     * @return energie
     */
    public double getEnergie() {
        return this.energie;
    }
}

