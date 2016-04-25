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
        
        //mettre a jour les Romms créées
        circus          = carte.get(1);
        shaolineDojo    = carte.get(2);
        zoo             = carte.get(3);
        frankLeBargeLab = carte.get(4);
        ferryBoat       = carte.get(5);
        bar             = carte.get(6);
        bikersClub      = carte.get(7);
        wildForest      = carte.get(8);
        casinoClub      = carte.get(9);
        airplane        = carte.get(10);
        satanFightArena = carte.get(11);
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
        Objet obj1 = new Instrument();
        Objet obj2 = new Nourriture();
        Objet obj3 = new Relique();
        Objet obj4 = new Relique();
        Objet obj5 = new Relique();
        
        Room temp1 = carte.get(objClef[0]);        
        Room temp2 = carte.get(objClef[1]);
        Room temp3 = carte.get(objClef[2]);
        Room temp4 = carte.get(objClef[3]);
        Room temp5 = carte.get(objClef[4]);
        temp1.setObjet(obj1);
        temp2.setObjet(obj2);
        temp3.setObjet(obj3);
        temp4.setObjet(obj4);
        temp5.setObjet(obj5);
        
        carte.put(objClef[0], temp1);
        carte.put(objClef[1], temp2);
        carte.put(objClef[2], temp3);
        carte.put(objClef[3], temp4);
        carte.put(objClef[4], temp5);
        
        int advClef = RAND.nextInt(10) + 1;
        
        Adversaire adv1 = new Monstre(10);
        Adversaire adv2 = new Catcheur(10);
        
        Room temp6 = carte.get(advClef);
        Room temp7 = carte.get(11);
        temp6.setAdversaire(adv1);
        temp7.setAdversaire(adv2);
        
        carte.put(advClef, temp6);
        carte.put(11, temp7);
        
        int currInit = RAND.nextInt(10) + 1;
        currentRoom = carte.get(currInit);
    }
    
    /**
     * Genere un tableau de 5 entiers au hasard
     * @return tableau de 5 entiers
     */
    private int[] randomiser() {
        int[] rdm = new int[5];
        int clef1 = RAND.nextInt(10) + 1;
        int clef2 = RAND.nextInt(10) + 1;
        while (clef2 == clef1) 
            clef2 = RAND.nextInt(10) + 1;
        int clef3 = RAND.nextInt(10) + 1;
        while ((clef3 == clef1) || (clef3 == clef2)) 
            clef3 = RAND.nextInt(10) + 1;
        int clef4 = RAND.nextInt(10) + 1;
        while ((clef4 == clef1) || (clef4 == clef2) || (clef4 == clef3)) 
            clef4 = RAND.nextInt(10) + 1;
        int clef5 = RAND.nextInt(10) + 1;
        while ((clef5 == clef1) || (clef5 == clef2) || 
            (clef5 == clef3) || (clef5 == clef4)) 
            clef5 = RAND.nextInt(10) + 1;
        rdm[0] = clef1;
        rdm[1] = clef2;
        rdm[2] = clef3;
        rdm[3] = clef4;
        rdm[4] = clef5;
        return rdm;
    }
    
}