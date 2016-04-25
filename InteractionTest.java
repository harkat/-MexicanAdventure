

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test InteractionTest.
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
 * se nommera NameTest.java); les deux se retrouvent dans le meme paquetage.
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
public class InteractionTest
{
    
    /**
     * Constructeur de la classe-test InteractionTest
     */
    public InteractionTest()
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
     * Teste le dialoge cirque
     */
    @Test
    public void testCircusTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.circusTalk()[3], "4");
    }
    
    /**
     * Teste le dialoge dojo
     */
    @Test
    public void testDojoTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.dojoTalk()[3], "1");
    }
    
    /**
     * Teste le dialoge zoo
     */
    @Test
    public void testZooTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.zooTalk()[3], "2");
    }
    
    /**
     * Teste le dialoge lab
     */
    @Test
    public void testLabTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.labTalk()[3], "3");
    }
    
    /**
     * Teste le dialoge ferryboat
     */
    @Test
    public void testFerryTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.ferryTalk()[3], "1");
    }
    
    /**
     * Teste le dialoge bar
     */
    @Test
    public void testBarTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.barTalk()[3], "2");
    }
    
    /**
     * Teste le dialoge bikersclub
     */
    @Test
    public void testBikeTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.bikeTalk()[3], "4");
    }
    
    /**
     * Teste le dialoge forest
     */
    @Test
    public void testForestTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.forestTalk()[3], "4");
    }
    
    /**
     * Teste le dialoge casino
     */
    @Test
    public void testCasinoTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.casinoTalk()[3], "2");
    }
    
    /**
     * Teste le dialoge plane
     */
    @Test
    public void testPlaneTalk()
    {
        Room room = new Room("a la gare");
        Hero hero = new Hero("neo");
        Objet objet = new Relique();
        Interaction action = new Interaction(room, hero);
        //assertEquals(action.planeTalk()[3], "2");
    }
}

