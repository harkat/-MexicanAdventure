
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
            case "le medaillon ancestral" :
                this.valeur = 1000;
                break;
            case "la croix rouillé" :
                this.valeur = 400;
                break;
            case "le sceptre sacré" :
                this.valeur = 1500;
                break;
            case "la montre temporelle" :
                this.valeur = 800;
                break;
            case "la bague magique" :
                this.valeur = 1200;
                break; 
            case "le coffret de pandore" :
                this.valeur = 1100;
                break; 
            case "le livre de magie" :
                this.valeur = 1300;
                break; 
        }
    }
    
    /**
     * accesseur valeur
     * @return valeur
     */
    public int getValeur() {
        return this.valeur;
    }
}