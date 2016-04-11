
/**
 * Represente une carte composee de multiples room
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Carte
{
    /**
     * la Room courante
     */
    public Room currentRoom;

    /**
     * Constructeur d'objets de classe Carte
     */
    public Carte()
    {
        createRooms();
    }
    
    /**
     * Create all the rooms and link their exits together.
     */
    public void createRooms()
    {      
        // create the rooms
        Room circus = new Room("in the circus");
        Room shaolineDojo = new Room("in the Shaoline dojo");
        Room zoo = new Room("in the zoo");
        Room frankLeBrageLab = new Room("in the Laboratory of FrankLeBrage");
        Room ferryBoat = new Room("in the ferryBoat");
        Room bar = new Room("in the bar");
        Room bikersClub = new Room("in the biker's club");
        Room wildForest = new Room("in the wild forest");
        Room casinoClub = new Room("in a casino club");
        Room airplane = new Room("in the airplane");
        Room satanFightArena = new Room("in Satan fighting arena");
        
        // initialise room exits
        circus.setExits(null, shaolineDojo, frankLeBrageLab, zoo,
            ">> South, vers FranckLeBarge");
        shaolineDojo.setExits(bar, null, null, circus,
            ">> West, vers Circus");
        zoo.setExits(wildForest, circus, null, null,
            ">> East, vers Circus");
        frankLeBrageLab.setExits(circus, ferryBoat, airplane, casinoClub,
            ">> South, airplane");
        ferryBoat.setExits(null, null, null, frankLeBrageLab,
            ">> South, vers FranckLeBarge");
        bar.setExits(null, null, shaolineDojo, bikersClub,
            ">> South, vers Shaoline Dojo");
        bikersClub.setExits(null, bar, null, wildForest,
            ">> West, vers wildForest");
        wildForest.setExits(null, bikersClub, zoo, null,
            ">> South, vers le zoo");
        casinoClub.setExits(null, frankLeBrageLab, satanFightArena, null,
            ">> South, vers Satan Fight Arena");
        airplane.setExits(frankLeBrageLab, null, null, satanFightArena,
            ">> West, vers Satan Fight Arena");
        satanFightArena.setExits(casinoClub, airplane, null, null, null);
        
        //mettre des objets
        Objet obj1 = new Instrument("fouet", 100, 50);
        Objet obj2 = new Nourriture("tacos", 50);
        Objet obj3 = new Relique("medaillon", 100, 1000);
        wildForest.setObjet(obj1);
        zoo.setObjet(obj2);
        ferryBoat.setObjet(obj3);
        

        currentRoom = bar;
    }

}
