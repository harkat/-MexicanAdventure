

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CatcheurTest.
 *
 * @author Jerry
 * @version V3
 */
public class CatcheurTest
{
    /**
     * Default constructor for test class CatcheurTest
     */
    public CatcheurTest()
    {
    }
    
    /**
     * test initial verifie la signature des methodes
     */@Test
    public void test_0_Initial() 
    {
        Catcheur ca = new Catcheur(10);
        assertEquals((ca instanceof Catcheur), true);
    }
    /**
    * Test des CONSTRUCTEURS
    */
    /**
    * Constructeur avec PtVie parametre valide
    */@Test
    public void test_1_a_ConstructeurPtVieParamValide()
    {
        Catcheur ca = new Catcheur(10);
        assertEquals((ca.getVie()==10), true);
    }
    /**
    * Test des METHODES
    */
    /**
    * Test methode Attaquer 
    */
   @Test
    public void test_2_a_Attaquer()
    {
        Catcheur ca1 = new Catcheur(10);
        Catcheur ca2 = new Catcheur(10);
        ca1.attaquer(ca2);
        assertEquals((ca2.getVie() == 9), true);
        assertEquals((ca1.getVie() == 10), true);
    }
    
   /**
    * Test methode subirFrappe
    */
   @Test
    public void test_3_a_subirFrappe()
    {
        Catcheur ca1 = new Catcheur(10);
        Catcheur ca2 = new Catcheur(10);
        ca1.attaquer(ca2);
        assertEquals((ca2.getVie() == 9), true);
        assertEquals((ca1.getVie() == 10), true);
    }
    
   /**
    * Test methode ajouterVie 
    */
   @Test
    public void test_4_a_ajouterVie()
    {
        Catcheur ca1 = new Catcheur(10);
        ca1.ajouterVie(5);
        assertEquals((ca1.getVie() == 15), true);
    }
}
