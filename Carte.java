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
        Objet obj3 = new Nourriture();
        while (obj3.equals(obj2)) obj3 = new Nourriture();
        Objet obj4 = new Nourriture();
        while (obj4.equals(obj2) || obj4.equals(obj3))
            obj4 = new Nourriture();
        Objet obj5 = new Relique();
        Objet obj6 = new Relique();
        while (obj6.equals(obj5)) obj6 = new Relique();
        Objet obj7 = new Relique();
        while (obj7.equals(obj5) || obj7.equals(obj6))
            obj7 = new Relique();
        
        Adversaire adv1 = new Monstre(9);
        Adversaire adv2 = new Monstre(8);
        while (adv2.equals(adv1)) adv2 = new Monstre(9);
        Adversaire adv3 = new Catcheur(11);
        Adversaire adv4 = new Catcheur("Satan", 15);
        
        Room temp1 = carte.get(objClef[0]);        
        Room temp2 = carte.get(objClef[1]);
        Room temp3 = carte.get(objClef[2]);
        Room temp4 = carte.get(objClef[3]);
        Room temp5 = carte.get(objClef[4]);
        Room temp6 = carte.get(objClef[5]);
        Room temp7 = carte.get(objClef[6]);
        Room temp8 = carte.get(11);
        
        temp1.setObjet(obj1);
        temp2.setObjet(obj2);
        temp3.setObjet(obj3);
        temp4.setObjet(obj4);
        temp5.setObjet(obj5);
        temp6.setObjet(obj6);
        temp7.setObjet(obj7);
        
        temp5.setAdversaire(adv1);
        temp6.setAdversaire(adv2);
        temp7.setAdversaire(adv3);
        temp8.setAdversaire(adv4);
        
        carte.put(objClef[0], temp1);
        carte.put(objClef[1], temp2);
        carte.put(objClef[2], temp3);
        carte.put(objClef[3], temp4);
        carte.put(objClef[4], temp5);
        carte.put(objClef[5], temp6);
        carte.put(objClef[6], temp7);
        carte.put(11, temp8);
        
        int currInit = RAND.nextInt(10) + 1;
        currentRoom = carte.get(currInit);
    }
    
    /**
     * Genere un tableau de 5 entiers au hasard
     * @return tableau de 5 entiers
     */
    private int[] randomiser() {
        int[] rdm = new int[7];
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
        int clef6 = RAND.nextInt(10) + 1;
        while ((clef6 == clef1) || (clef6 == clef2) || 
            (clef6 == clef3) || (clef6 == clef4) || (clef6 == clef5)) 
            clef6 = RAND.nextInt(10) + 1;
        int clef7 = RAND.nextInt(10) + 1;
        while ((clef7 == clef1) || (clef7 == clef2) || 
            (clef7 == clef3) || (clef7 == clef4) ||
            (clef7 == clef5) || (clef7 == clef6)) 
            clef7 = RAND.nextInt(10) + 1;
        rdm[0] = clef1;
        rdm[1] = clef2;
        rdm[2] = clef3;
        rdm[3] = clef4;
        rdm[4] = clef5;
        rdm[5] = clef6;
        rdm[6] = clef7;
        return rdm;
    }
    
}