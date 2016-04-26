

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HeroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeroTest
{
    /**
     * Default constructor for test class HeroTest
     */
    public HeroTest()
    {
    }
    
    /**
     * test initial verifie la signature des methodes
     */@Test
    public void test_0_Initial() 
    {
        Hero h = new Hero("nom_hero");
        assertEquals((h instanceof Hero), true);
    }
    /**
    * Test des CONSTRUCTEURS
    */
    /**
    * Constructeur avec parametre valide
    */@Test
    public void test_1_a_ConstructeurParamValide()
    {
        Hero h = new Hero("nom_hero");
        assertEquals(((h.getVie() == 5)), true);  
        assertEquals(h.getNom(), "nom_hero");
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
        Hero h = new Hero("nom_hero");
        Monstre mo = new Monstre(10);
        h.attaquer(mo);
        assertEquals((mo.getVie() == 8), true);
        assertEquals((h.getVie() == 5), true);
    }
    
   /**
    * Test methode subirFrappe
    */
   @Test
    public void test_3_a_subirFrappe()
    {
        Hero h = new Hero("nom_hero");
        Monstre mo = new Monstre(10);
        mo.attaquer(h);
        assertEquals((mo.getVie() == 10), true);
        assertEquals((h.getVie() == 4), true);       
    }
    
   /**
    * Test methode ajouterVie 
    */
   @Test
    public void test_4_a_ajouterVie()
    {
        Hero h = new Hero("nom_hero");
        h.ajouterVie(5);
        assertEquals((h.getVie() == 10), true);
    }
    
       /**
    * Test methode etreMort 
    */
   @Test
    public void test_5_a_etreMort()
    {
        //depart
        Hero h = new Hero("nom_hero");
        Monstre mo = new Monstre(10);
        mo.attaquer(h);
        mo.attaquer(h);
        mo.attaquer(h);
        mo.attaquer(h);
        mo.attaquer(h);
        assertEquals(h.etreMort(), true);
    }
}
