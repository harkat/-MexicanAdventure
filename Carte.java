
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
        Room circus = new Room("au cirque");
        Room shaolineDojo = new Room("au temple des Shaoline");
        Room zoo = new Room("au zoo");
        Room frankLeBrageLab = new Room("au Laboratoir de FrankLeBrage");
        Room ferryBoat = new Room("au ferryBoat");
        Room bar = new Room("au bar");
        Room bikersClub = new Room("au clube des motards");
        Room wildForest = new Room("à la foret sauvage");
        Room casinoClub = new Room("au clube casino");
        Room airplane = new Room("à l'aéroport");
        Room satanFightArena = new Room("à l'arène finale " +
            "de combat de Satan");
        
        // initialise room exits
        circus.setExits(null, shaolineDojo, frankLeBrageLab, zoo,
            ">> Sud, vers FranckLeBarge");
        shaolineDojo.setExits(bar, null, null, circus,
            ">> Ouest, vers le cirque");
        zoo.setExits(wildForest, circus, null, null, ">> Est, vers le cirque");
        frankLeBrageLab.setExits(circus, ferryBoat, airplane, casinoClub,
            ">> Sud, l'aéroport");
        ferryBoat.setExits(null, null, null, frankLeBrageLab,
            ">> Sud, vers FranckLeBarge");
        bar.setExits(null, null, shaolineDojo, bikersClub,
            ">> Sud, vers le temple des Shaoline");
        bikersClub.setExits(null, bar, null, wildForest,
            ">> Ouest, vers la foret sauvage");
        wildForest.setExits(null, bikersClub, zoo, null, ">> Sud, le zoo");
        casinoClub.setExits(null, frankLeBrageLab, satanFightArena, null,
            ">> Sud, vers Satan Fight Arena");
        airplane.setExits(frankLeBrageLab, null, null, satanFightArena,
            ">> Ouest, vers l'arène finale de combat de Satan");
        satanFightArena.setExits(casinoClub, airplane, null, null, null);
        
        //mettre des objets
        Objet obj1 = new Instrument(100, 50);
        Objet obj2 = new Nourriture(50);
        Objet obj3 = new Relique(100, 1000);
        wildForest.setObjet(obj1);
        zoo.setObjet(obj2);
        ferryBoat.setObjet(obj3);
        
        Adversaire adv1 = new Monstre(100);
        Adversaire adv2 = new Catcheur(100);
        bikersClub.setAdversaire(adv1);
        casinoClub.setAdversaire(adv2);

        currentRoom = bar;
    }

}
