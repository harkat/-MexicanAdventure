

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CatcheurTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
    
    
    /**
     * methode verifier
     * comme Lanceur.assertEquals mais plus rapide a ecrire
     */
    public void verifier(Object attendu, Object obtenu, String erreur) 
    {
        LanceurProjet.assertEquals(attendu, obtenu, erreur);
    }
    
    /**
     * test initial verifie la signature des methodes
     */@Test
    public void test_0_Initial() 
    {
        Catcheur ca = new Catcheur(10);
    }
    /**
    * Test des CONSTRUCTEURS
    */
    /**
    * Constructeur avec PtVie parametre valide
    */@Test
    public void test_1_a_ConstructeurPtVieParamValide()
    {
        //test
        Catcheur ca = new Catcheur(10);
        
        //verification des resultats
        verifier(10.0, ca.getVie(), "Probleme constructeur pv attendu 10");
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
        //depart
        Catcheur ca = new Catcheur(10);
        Catcheur adv = new Catcheur(10); // adversaire valide 10 ptVie
        
        //test
        ca.attaquer(adv);
        
        //verification des resultats
        verifier(5.0, adv.getVie(), "Adversaire ne perd pas le bon nombre de ptVie");
        verifier(10.0, ca.getVie(), "Catcheur ne doit pas perdre de vie");
    }
}
