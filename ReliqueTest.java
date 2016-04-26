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
public class ReliqueTest
{
    /**
     * Default constructor for test class CatcheurTest
     */
    public ReliqueTest()
    {
    }
    
    /**
     * test initial verifie la signature des methodes
     */
    @Test
    public void test_0_Initial() 
    {
        Relique re = new Relique();
        assertEquals((re instanceof Relique), true);
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
        Relique re = new Relique();
        assertEquals((re.getPoints()!=0), true);
        assertEquals((re.getNom()!=""), true);
    }
    
    /**
    * Constructeur test valeur
    */
    @Test
    public void test_1_a_ConstructeurValideValeur()
    {
        Relique re = new Relique();
        assertEquals((re.getValeur()>=400), true);
    }
}
