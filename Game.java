import java.util.Scanner;
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class Game 
{
    private Parser parser;
    private Carte carte;
    private Hero hero ;
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        this.carte = new Carte();
        this.parser = new Parser();
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        System.out.print("Donnez un nom à votre Hero : "); 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        this.hero = new Hero (str) ;
        printWelcome();
        
        Dialogue diag = new Dialogue(carte.currentRoom, this.hero) ;
        diag.dialogueMaker();
        afficherCourant();
        boolean finished = false;
        while (!finished && !this.hero.etreMort() ) {
            Command command = parser.getCommand();
            if (command.getSecondWord() != null) {
                String direction = command.getSecondWord();
                Room nextRoom = carte.currentRoom.nextRoom(direction) ;
                if (nextRoom != null) {
                    diag = new Dialogue(nextRoom, this.hero) ;
                    diag.dialogueMaker();
                }
            }
            finished = processCommand(command);
        }   
        if (this.hero.etreMort()) {
            System.out.println(); 
            System.out.println("Vous n'avez plus de point de vie, " +
                "vous êtes mort !"); 
        }
        System.out.println("Jeu terminé ! Merci d'avoir perdu " +
            "votre temps sur notre jeu :)");       
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Salut " + this.hero.getNom() + ",");
        System.out.println("Soyez le bienvenue dans les " +
            "aventures du Catcheur Mexicain!");
        System.out.println("les aventures du Catcheur Mexicain " +
            "est un nouveau jeu, ");
        System.out.println("super cool que même " +
            "Ubisoft envie.");
        System.out.println("Pour avoir de l'aide sur " +
            "les commandes, tapez: aide.");
        System.out.println();
        System.out.print("Appuyez sur n'importe quelle " +
            "touche pour commencer..."); 
        sc.nextLine();
        System.out.println();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if (command.isUnknown()) {
            System.out.println("Je ne comprend ce que vous voulez dire ! " +
                "vous êtes saoul ou quoi ?");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("aide")) {
            printHelp();
        }
        else if (commandWord.equals("aller")) {
            goRoom(command);
            if (carte.currentRoom.description.equals(
                "à l'arène finale de combat de Satan")) {
                wantToQuit = true ;
            }
        }
        else if (commandWord.equals("quitter")) {
            wantToQuit = quit(command);
        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("Ne paniquez surtout pas, je suis là pour vous");
        System.out.println("vous êtes à " + carte.currentRoom.description);
        System.out.println();
        System.out.println("Vous pouvez taper : ");
        System.out.println("aller [sud, est, ouest, nord], quitter, aide");
    }

    /** 
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     * @param command The command to be processed.
     */
    private void goRoom(Command command) 
    {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Désolé je ne peux pas deviner la direction ! "
                + "il faut me dire dans quelle direction aller");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if (direction.equals("nord")) {
            nextRoom = carte.currentRoom.northExit;
        }
        if (direction.equals("est")) {
            nextRoom = carte.currentRoom.eastExit;
        }
        if (direction.equals("sud")) {
            nextRoom = carte.currentRoom.southExit;
        }
        if (direction.equals("ouest")) {
            nextRoom = carte.currentRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("Il n'y a pas d'accès par cette direction");
        }
        else {
            carte.currentRoom = nextRoom;
            if (carte.currentRoom.getDescription().equals(
                "à l'arène finale de combat de Satan")) {
                System.out.println("Vous êtes enfin arrivé " + 
                    carte.currentRoom.getDescription());
                System.out.println("Félicitations, " +
                    "vous avez atteint la zone finale");
                System.out.println("Le jeu est terminé");
                return;
            }            
            afficherCourant();
        }
    }
    
    /**
     * Affiche la Room courante et les issues possibles
     */
    private void afficherCourant() {
        System.out.println("Vous êtes " +
            carte.currentRoom.getDescription());
        System.out.print("Sorties: ");
        if (carte.currentRoom.northExit != null) {
            System.out.print("nord ");
        }
        if (carte.currentRoom.eastExit != null) {
            System.out.print("est ");
        }
        if (carte.currentRoom.southExit != null) {
            System.out.print("sud ");
        }
        if (carte.currentRoom.westExit != null) {
            System.out.print("ouest ");
        }            
        System.out.println();
    }
    
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @param command The command to be processed.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if (command.hasSecondWord()) {
            System.out.println("Quitter quoi au juste? " +
                "Si vous voulez abandonner, il faut écrire: quitter");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}
