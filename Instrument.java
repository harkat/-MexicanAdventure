
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
    private double degat;
    /**
     * cree un instrument
     */
    public Instrument() {
        super();
        switch(this.nom) {
            case "guitar" :
                this.degat = 4;
                break;
            case "fouet" :
                this.degat = 2;
                break;
            case "sombrero" :
                this.degat = 1;
                break;
            case "poison" :
                this.degat = 2;
                break;
            case "couteau" :
                this.degat = 3;
                break;  
        }
    }
    
    public double getDegat() {
        return this.degat;
    }
}
