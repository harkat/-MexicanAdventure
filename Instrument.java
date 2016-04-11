
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
     * @param pts les points appotes
     * @param dgt le degat que peu causer
     */
    public Instrument(int pts, int dgt) {
        super(pts);
        this.degat = dgt;
    }
}
