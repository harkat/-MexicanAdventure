
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
     * cree un objet
     * @param nom le nom de l'objet
     * @param pts les points appotes
     */
    protected Objet(String nom, int pts) {
        this.nom = nom;
        this.points = pts;
    }
}
