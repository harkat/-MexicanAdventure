
/**
 * Represente les objets de type Relique
 *
 * @author  Groupe 6
 * @version V2.0
 */

public class Relique extends Objet
{
    /**
     * valeur la valeur de la relique
     */
    private int valeur;
    /**
     * cree une relique
     */
    public Relique() {
        super();        
        switch(this.nom) {
            case "medaillon" :
                this.valeur = 1000;
                break;
            case "croix" :
                this.valeur = 400;
                break;
            case "sceptre" :
                this.valeur = 1500;
                break;
            case "montre" :
                this.valeur = 800;
                break;
            case "bague" :
                this.valeur = 1200;
                break; 
            case "coffret" :
                this.valeur = 1100;
                break; 
            case "livre" :
                this.valeur = 1300;
                break; 
        }
    }

    public int getValeur() {
        return this.valeur;
    }
}