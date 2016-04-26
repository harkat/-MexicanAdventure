import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CatcheurTest.
 *
 * @author Groupe 06
 * @version V3
 */
public class NourritureTest
{
    /**
     * Default constructor for test class CatcheurTest
     */
    public NourritureTest()
    {
    }
    
    /**
     * test initial verifie la signature des methodes
     */
    @Test
    public void test_0_Initial() 
    {
        Nourriture nr = new Nourriture();
        assertEquals((nr instanceof Nourriture), true);
    }
    /**
    * Test des CONSTRUCTEURS
    */
    /**
    * Constructeur
    */
    @Test
    public void test_1_a_ConstructeurValide()
    {
        Nourriture nr = new Nourriture();
        assertEquals((nr.getPoints()==0), true);
        assertEquals((nr.getNom()!=""), true);
    }
    
    /**
    * Constructeur test valeur
    */
    @Test
    public void test_1_a_ConstructeurValideEnergie()
    {
        Nourriture nr = new Nourriture();
        assertEquals((nr.getEnergie()>=3), true);
        assertEquals((nr.getEnergie()<=6), true);
    }
}
