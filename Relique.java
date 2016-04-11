
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
     * @param pts les points appotes
     * @param val la valeur de la relique
     */
    public Relique(int pts, int val) {
        super(pts);
        this.valeur = val;
    }
}