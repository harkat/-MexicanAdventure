import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MonstreTest.
 *
 * @author Jerry
 * @version V3
 */
public class MonstreTest
{
    /**
     * Default constructor for test class MonstreTest
     */
    public MonstreTest()
    {
    }
    
    /**
     * test initial verifie la signature des methodes
     */@Test
    public void test_0_Initial()   
    {
        Monstre mo = new Monstre(10);
        assertEquals((mo instanceof Monstre), true);
    }
    /**
    * Test des CONSTRUCTEURS
    */
    /**
    * Constructeur avec PtVie parametre valide
    */@Test
    public void test_1_a_ConstructeurPtVieParamValide()
    {
        Monstre mo = new Monstre(10);
        assertEquals((mo.getVie()!=0), true);
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
        Monstre mo1 = new Monstre(10);
        Monstre mo2 = new Monstre(10);
        mo1.attaquer(mo2);
        assertEquals((mo2.getVie() == 9), true);
        assertEquals((mo1.getVie() == 10), true);
    }
    
   /**
    * Test methode subirFrappe
    */
   @Test
    public void test_3_a_subirFrappe()
    {
        Monstre mo1 = new Monstre(10);
        Monstre mo2 = new Monstre(10);
        mo1.attaquer(mo2);
        assertEquals((mo2.getVie() == 9), true);
        assertEquals((mo1.getVie() == 10), true);
    }
    
   /**
    * Test methode ajouterVie 
    */
   @Test
    public void test_4_a_ajouterVie()
    {
        Monstre mo1 = new Monstre(10);
        mo1.ajouterVie(5);
        assertEquals((mo1.getVie() == 15), true);
    }
}


