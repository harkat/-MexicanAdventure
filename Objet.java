
/**
 * Represente tout type d'objet
 * present dans une carte
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Objet
{
    
    protected String nom;
    protected int points;

    /**
     *
     */
    public Objet(String nom, int pts) {
        this.nom = nom;
        this.points = pts;
    }
}
