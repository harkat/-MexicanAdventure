import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//Packages for using the assertion kind : assertThat(value, matcher statement)
//assertThat is more readable than assertEquals and has more informative message
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;
// Packages for redirecting System.out and System.err to test values
import java.io.*;
import java.util.Scanner;

/**
 * Classe-test GameTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class GameTest
{
    // yteStream pour capturer les sorties et erreurs standards
    private final ByteArrayOutputStream outContent = 
        new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = 
        new ByteArrayOutputStream();

    private final InputStream stdin = System.in;
    private final PrintStream stdout = System.out;

    /* POSITIONNEMENT DE LA CAPTURE DES SORTIES STANDARDS */

    /**
     * Positionne les sorties standards vers les ByteStream.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUpStreams() throws IOException {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Replace les sorties standards dans leur état initial.
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void cleanUpStreams() {
        System.setOut(stdout);
        System.setIn(stdin);
    }

    /**
     * Test du fonctionnement de la capture de la sortie standard.
     *
     */
    @Test
    public void outCapture() {
        System.setOut(new PrintStream(outContent));
        System.out.println("hello");
        assertThat(outContent.toString(), is("hello\n"));
    }

    /**
     * Test du fonctionnement de l'injection sur l'entrée.
     *
     */
    @Test
    public void inInjection() {
        String data = "Hello, World!\r\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        try {
            assertThat(scanner.nextLine(), is(data.trim()));
        } 
        catch (java.util.NoSuchElementException e) {
            fail(e.getMessage());
        } 
        catch (IllegalStateException e) {
            fail(e.getMessage());
        }
    }

    /** TESTS DE LA CLASSE Game **/

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test GameTest
     */
    public GameTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    /**
     * Teste la creation du jeu et la sortie
     */
    @Test
    public void createGamePlayAndQuit()
    {
        String data = "quit\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Game g = new Game();
        g.play();

        assertThat(outContent.toString(),
            containsString("Welcome to the World of Zuul!"));
        assertThat(outContent.toString(),
            containsString("Thank you for playing.  Good bye."));
    }

    /**
     * Teste le du jeu et le menu help
     */
    @Test
    public void playGameAndHelp() {
        String data = "help\nquit\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Game g = new Game();
        g.play();

        assertThat(outContent.toString(),
            containsString("Your command words are:"));
    }

    /**
     * Teste le deplacement dans les Rooms
     */
    @Test
    public void visitAllRooms() {
        StringBuffer buff = new StringBuffer();
        buff.append("go east\n");
        buff.append("go west\n");
        buff.append("go south\n");
        buff.append("go east\n");
        buff.append("go west\n");
        buff.append("go north\n");
        buff.append("go west\n");
        buff.append("go east\n");
        buff.append("quit\n");
        
        System.setIn(new ByteArrayInputStream(buff.toString().getBytes()));

        Game g = new Game();
        g.play();

        String[] lines = outContent.toString().split("\n");
        
        // Room theater
        assertThat(lines[7], containsString("in a lecture theater"));
        // Room outside
        assertThat(lines[9],
            containsString("outside the main entrance of the university"));
        // Room lab
        assertThat(lines[11], containsString("in a computing lab"));
        // Room office
        assertThat(lines[13], containsString("in the computing admin office"));
        // Room pub
        assertThat(lines[19], containsString("in the campus pub"));
        // End of program
        assertThat(lines[23],
            containsString("Thank you for playing.  Good bye."));

    }
}

