
/**
 * Represente une carte composee de multiples room
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Carte
{
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
        Room circus = new Room("int the circus");
        Room ShaolineDojo = new Room("in the Shaoline dojo");
        Room zoo = new Room("in the zoo");
        Room FrankLeBrageLab = new Room("in the Laboratory of FrankLeBrage");
        Room ferryBoat = new Room("in the ferryBoat");
        Room bar = new Room("in the bar");
        Room bikersClub = new Room("in the biker's club");
        Room wildForest = new Room("in the wild forest");
        Room casinoClub = new Room("in a casino club");
        Room airplane = new Room("in the airplane");
        Room SatanFightArena = new Room("in the Satan fighting arena");
        
        // initialise room exits
        circus.setExits(null, ShaolineDojo, FrankLeBrageLab, zoo, FrankLeBrageLab);
        ShaolineDojo.setExits(bar, null, null, circus, circus);
        zoo.setExits(wildForest, circus, null, null, circus);
        FrankLeBrageLab.setExits(circus, ferryBoat, airplane, casinoClub, airplane);
        ferryBoat.setExits(null, null, null, FrankLeBrageLab, FrankLeBrageLab);
        
        bar.setExits(null, null, ShaolineDojo, bikersClub, ShaolineDojo);
        bikersClub.setExits(null, bar, null, wildForest, wildForest);
        wildForest.setExits(null, bikersClub, zoo, null, zoo);
        casinoClub.setExits(null, FrankLeBrageLab, SatanFightArena, null, SatanFightArena);
        airplane.setExits(FrankLeBrageLab, null, null, SatanFightArena, SatanFightArena);
        SatanFightArena.setExits(casinoClub, airplane, null, null, null);
        
        //mettre des objets
        Objet obj1 = new Instrument("fouet", 100, 50);
        Objet obj2 = new Nourriture("taco", 50);
        Objet obj3 = new Relique("medaillon", 100, 1000);
        wildForest.setObjet(obj1);
        zoo.setObjet(obj2);
        ferryBoat.setObjet(obj3);
        

        currentRoom = bar;
    }

}
