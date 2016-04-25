

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InteractionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InteractionTest
{
    /**
     * Default constructor for test class InteractionTest
     */
    public InteractionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void InterctionMaker()
    {
        Room room1 = new Room("au ferryBoat");
        Carte carte1 = new Carte();
        carte1.createRooms();
        Hero hero1 = new Hero("daugi");
        Interaction interact1 = new Interaction(room1, hero1);
        interact1.interactionMaker();
    }
}

