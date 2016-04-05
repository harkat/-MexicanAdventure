
/**
 * Represente les objets de type Instrument
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Instrument extends Objet
{

    private int degat;

    public Instrument(String nom, int pts, int dgt){
        super(nom, pts);
        this.degat = dgt;
    }
    
}
