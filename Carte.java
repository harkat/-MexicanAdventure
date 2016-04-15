import java.util.HashMap;
import java.util.Random;
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
     * table contient les Room qui compose la Carte
     */
    public HashMap<Integer, Room> carte = new HashMap<Integer, Room>();
    /**
     * pour generer des valeurs aleatoires
     */
    private static final Random RAND = Randomizer.getRandom();

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
        Room shaolineDojo = new Room("au monastère Shaolin");
        Room zoo = new Room("au zoo");
        Room frankLeBargeLab = new Room("au Laboratoire de FrankLeBarge");
        Room ferryBoat = new Room("au ferryBoat");
        Room bar = new Room("au bar");
        Room bikersClub = new Room("au club des motards");
        Room wildForest = new Room("à la foret sauvage");
        Room casinoClub = new Room("au casino");
        Room airplane = new Room("à l'aéroport");
        Room satanFightArena = new Room("à l'arène finale " +
            "de combat de Satan");
        
        // initialise room exits
        circus.setExits(null, shaolineDojo, frankLeBargeLab, zoo,
            ">> Sud, vers FranckLeBarge");
        shaolineDojo.setExits(bar, null, null, circus,
            ">> Ouest, vers le cirque");
        zoo.setExits(wildForest, circus, null, null, ">> Est, vers le cirque");
        frankLeBargeLab.setExits(circus, ferryBoat, airplane, casinoClub,
            ">> Sud, l'aéroport");
        ferryBoat.setExits(null, null, null, frankLeBargeLab,
            ">> Sud, vers FranckLeBarge");
        bar.setExits(null, null, shaolineDojo, bikersClub,
            ">> Sud, vers le monastère Shaolin");
        bikersClub.setExits(null, bar, null, wildForest,
            ">> Ouest, vers la foret sauvage");
        wildForest.setExits(null, bikersClub, zoo, null, ">> Sud, le zoo");
        casinoClub.setExits(null, frankLeBargeLab, satanFightArena, null,
            ">> Sud, vers Satan Fight Arena");
        airplane.setExits(frankLeBargeLab, null, null, satanFightArena,
            ">> Ouest, vers l'arène finale de combat de Satan");
        satanFightArena.setExits(casinoClub, airplane, null, null, null);
        
        //mettre les Room dans un tableau associatif
        carte.put(1, circus);
        carte.put(2, shaolineDojo);
        carte.put(3, zoo);
        carte.put(4, frankLeBargeLab);
        carte.put(5, ferryBoat);
        carte.put(6, bar);
        carte.put(7, bikersClub);
        carte.put(8, wildForest);
        carte.put(9, casinoClub);
        carte.put(10, airplane);
        carte.put(11, satanFightArena);
        
        remplirMap();
    }
    
    /**
     * Cree 3 Objets et 3 Adversaires
     * et les met au hasard
     * dans 3 Rooms differentes pour les Objets
     * dans 2 Rooms differentes pour les Adversaires
     * 
     * Choisit la Room courante au hasard
     */
    private void remplirMap() {
        int[] objClef = randomiser();
        //mettre des objets
        Objet obj1 = new Instrument(100, 50);
        Objet obj2 = new Nourriture(50);
        Objet obj3 = new Relique(100, 1000);
        
        Room temp1 = carte.get(objClef[0]);        
        Room temp2 = carte.get(objClef[1]);
        Room temp3 = carte.get(objClef[2]);
        temp1.setObjet(obj1);
        temp2.setObjet(obj2);
        temp3.setObjet(obj3);
        
        carte.put(objClef[0], temp1);
        carte.put(objClef[1], temp2);
        carte.put(objClef[2], temp3);
        
        int[] advClef = randomiser();
        
        Adversaire adv1 = new Monstre(100);
        Adversaire adv2 = new Catcheur(100);
        
        Room temp4 = carte.get(advClef[0]);
        Room temp5 = carte.get(advClef[1]);
        temp4.setAdversaire(adv1);
        temp5.setAdversaire(adv2);
        
        carte.put(advClef[0], temp4);
        carte.put(advClef[1], temp5);
        
        currentRoom = carte.get(randomiser()[0]);
    }
    
    /**
     * Genere un tableau de 3 entiers au hasard
     * @return tableau de 3 entiers
     */
    private int[] randomiser() {
        int[] rdm = new int[3];
        int clef1 = RAND.nextInt(10) + 1;
        int clef2 = RAND.nextInt(10) + 1;
        while (clef2 == clef1) clef2 = RAND.nextInt(10) + 1;
        int clef3 = RAND.nextInt(10) + 1;
        while ((clef3 == clef1) || (clef3 == clef2)) 
            clef3 = RAND.nextInt(10) + 1;
        rdm[0] = clef1;
        rdm[1] = clef2;
        rdm[2] = clef3;
        return rdm;
    }
    
}