
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
     * tag l'index vers l'energie de la nourriture
     * energie l'energie donnee au personnage
     */
    private int tag;
    private int energie;
    /**
     * cree une nourriture
     * @param nom le nom de la nourriture
     * @param nrg l'energie qui donne au personnage
     */
    public Nourriture(String nom, int nrg) {
        super(nom, 0);
        this.energie = nrg;
    }
}
