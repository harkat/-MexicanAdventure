

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test RoomTest.
 *
 * @author  Groupe 6
 * @version V2.0
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
public class RoomTest
{

    /**
     * Constructeur de la classe-test RoomTest
     */
    public RoomTest()
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
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
    }

    /**
     * Teste l'affectation des sorties
     */
    @Test
    public void testSetExits()
    {
        Room room1 = new Room("au bar");
        Room room2 = new Room("au cinema");
        Room room3 = new Room("au stade");
        room1.setExits(room2, null, room3, null, "sud");
        assertEquals(room1.directSortie, "sud");
        assertEquals(room1.northExit.getDescription(), "au cinema");
        assertEquals(room1.westExit, null);
    }
    
    /**
     * Teste la describtion d'une Room
     */
    @Test
    public void testGetDescription()
    {
        Room room = new Room("a la gare");
        assertEquals("a la gare", room.getDescription());
    }
    
    /**
     * Teste l'affectation d'un Adversaire
     */
    @Test
    public void testSetAdversaire()
    {
        Room room = new Room("a la gare");
        Adversaire monstre = new Monstre(100);
        room.setAdversaire(monstre);
        assertEquals(room.adversaire, monstre);
    }
    
    /**
     * Teste l'affectation d'un Obje
     */
    @Test
    public void testSetObjet()
    {
        Room room = new Room("a la gare");
        Objet instrument = new Instrument();
        room.setObjet(instrument);
        assertEquals(room.objet, instrument);
    }
    
    /**
     * Teste la Room suivante
     */
    @Test
    public void testNextRoom()
    {
        Room room1 = new Room("a la gare");
        Room room2 = new Room("au stade");
        room1.setExits(null, null, null, room2, "ouest");
        assertEquals(room2, room1.nextRoom("ouest"));
    }
}