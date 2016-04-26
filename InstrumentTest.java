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
public class InstrumentTest
{
    /**
     * Default constructor for test class CatcheurTest
     */
    public InstrumentTest()
    {
    }
    
    /**
     * test initial verifie la signature des methodes
     */
    @Test
    public void test_0_Initial() 
    {
        Instrument inst = new Instrument();
        assertEquals((inst instanceof Instrument), true);
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
        Instrument inst = new Instrument();
        assertEquals((inst.getPoints()!=0), true);
        assertEquals((inst.getNom()!=""), true);
    }
    
    /**
    * Constructeur test valeur
    */
    @Test
    public void test_1_a_ConstructeurValideDegat()
    {
        Instrument inst = new Instrument();
        assertEquals((inst.getDegat()>=3), true);
    }
}
