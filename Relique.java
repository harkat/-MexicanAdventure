
/**
 * Represente les objets de type Relique
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Relique extends Objet
{
    
    private int valeur;
    
    public Relique(String nom, int pts, int val){
        super(nom, pts);
        this.valeur = val;
    }
}
