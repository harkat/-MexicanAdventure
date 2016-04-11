
/**
 * Represente les objets de type Instrument
 *
 * @author  Groupe 6
 * @version V2.0
 */
public class Instrument extends Objet
{
    /**
     * represente le degat qui peut causer
     */
    private int degat;
    /**
     * cree un instrument
     * @param nom le nom de l'instrument
     * @param pts les points appotes
     * @param dgt le degat que peu causer
     */
    public Instrument(String nom, int pts, int dgt) {
        super(nom, pts);
        this.degat = dgt;
    }
    
}
