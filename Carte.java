
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
        Room circus = new Room("au cirque");
        Room ShaolineDojo = new Room("au temple des Shaoline");
        Room zoo = new Room("au zoo");
        Room FrankLeBrageLab = new Room("au Laboratoir de FrankLeBrage");
        Room ferryBoat = new Room("au ferryBoat");
        Room bar = new Room("au bar");
        Room bikersClub = new Room("au clube des motards");
        Room wildForest = new Room("à la foret sauvage");
        Room casinoClub = new Room("au clube casino");
        Room airplane = new Room("à l'aéroport");
        Room SatanFightArena = new Room("à l'arène finale de combat de Satan");
        
        // initialise room exits
        circus.setExits(null, ShaolineDojo, FrankLeBrageLab, zoo, ">> Sud, vers FranckLeBarge");
        ShaolineDojo.setExits(bar, null, null, circus, ">> Ouest, vers le cirque");
        zoo.setExits(wildForest, circus, null, null, ">> Est, vers le cirque");
        FrankLeBrageLab.setExits(circus, ferryBoat, airplane, casinoClub, ">> Sud, l'aéroport");
        ferryBoat.setExits(null, null, null, FrankLeBrageLab, ">> Sud, vers FranckLeBarge");
        
        bar.setExits(null, null, ShaolineDojo, bikersClub, ">> Sud, vers le temple des Shaoline");
        bikersClub.setExits(null, bar, null, wildForest, ">> Ouest, vers la foret sauvage");
        wildForest.setExits(null, bikersClub, zoo, null, ">> Sud, le zoo");
        casinoClub.setExits(null, FrankLeBrageLab, SatanFightArena, null, ">> Sud, vers Satan Fight Arena");
        airplane.setExits(FrankLeBrageLab, null, null, SatanFightArena, ">> Ouest, vers l'arène finale de combat de Satan");
        SatanFightArena.setExits(casinoClub, airplane, null, null, null);
        
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
