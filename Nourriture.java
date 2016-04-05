
/**
 * Represente les objets de type Nourriture
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Nourriture extends Objet
{
    // a remplacer plutard par une table associative
    private int tag;
    private int energie;
    
    public Nourriture(String nom, int nrg){
        super(nom, 0);
        this.energie = nrg;
    }
}
