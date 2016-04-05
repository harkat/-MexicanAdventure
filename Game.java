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
    //private Room currentRoom;
    private Carte carte;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game(Carte crt) 
    {
        this.carte = crt;
        parser = new Parser();
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.print("World of Zuul is a new, ");
        System.out.println("incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are " + carte.currentRoom.getDescription());
        System.out.print("Exits: ");
        if (carte.currentRoom.northExit != null) {
            System.out.print("north ");
        }
        if (carte.currentRoom.eastExit != null) {
            System.out.print("east ");
        }
        if (carte.currentRoom.southExit != null) {
            System.out.print("south ");
        }
        if (carte.currentRoom.westExit != null) {
            System.out.print("west ");
        }
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
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
            if(carte.currentRoom.getDescription().equals("in the Satan fighting arena")) wantToQuit = true;
        }
        else if (commandWord.equals("quit")) {
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
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("   go quit help");
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
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if (direction.equals("north")) {
            nextRoom = carte.currentRoom.northExit;
        }
        if (direction.equals("east")) {
            nextRoom = carte.currentRoom.eastExit;
        }
        if (direction.equals("south")) {
            nextRoom = carte.currentRoom.southExit;
        }
        if (direction.equals("west")) {
            nextRoom = carte.currentRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            carte.currentRoom = nextRoom;
            if(carte.currentRoom.getDescription().equals("in the Satan fighting arena")){
                System.out.println("You are " + carte.currentRoom.getDescription());
                System.out.println("Gongratulation, you've reached the target");
                System.out.println("the game is over");
                return;
            }
            
            System.out.println("You are " + carte.currentRoom.getDescription());
            System.out.print("Exits: ");
            if (carte.currentRoom.northExit != null) {
                System.out.print("north ");
            }
            if (carte.currentRoom.eastExit != null) {
                System.out.print("east ");
            }
            if (carte.currentRoom.southExit != null) {
                System.out.print("south ");
            }
            if (carte.currentRoom.westExit != null) {
                System.out.print("west ");
            }
            System.out.println();
        }
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
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}
