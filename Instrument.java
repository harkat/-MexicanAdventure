
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
            case "une guitar" :
                this.degat = 4;
                break;
            case "un fouet" :
                this.degat = 2;
                break;
            case "un sombrero" :
                this.degat = 1;
                break;
            case "un poison" :
                this.degat = 2;
                break;
            case "un couteau" :
                this.degat = 3;
                break;  
        }
    }
    
    /**
     * accesseur degat
     * @return degat
     */
    public double getDegat() {
        return this.degat;
    }
}
