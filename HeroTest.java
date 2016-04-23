

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
        Hero h = new Hero("nom_hero");
    }
    /**
    * Test des CONSTRUCTEURS
    */
    /**
    * Constructeur avec parametre valide
    */@Test
    public void test_1_a_ConstructeurParamValide()
    {
        //test
        Hero h = new Hero("nom_hero");
        
        //verification des resultats
        verifier(5.0, h.getVie(), "Probleme constructeur pv attendu 5");
        verifier("nom_hero", h.getNom(), "Probleme constructeur nom");
      
    }
    /**
    * Constructeur avec parametre non valide
    */@Test
    public void test_1_b_ConstructeurParamnonValide()
    {
        //test
        Hero h = new Hero(null);
        
        //verification des resultats
        verifier(5.0, h.getVie(), "Probleme constructeur pv attendu 5");
        verifier("Hercon", h.getNom(), "Probleme constructeur nom par defaut si null");
      
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
        Hero h = new Hero("nom_hero");
        Monstre adv = new Monstre(10); // adversaire valide 10 ptVie
        
        //test
        h.attaquer(adv);
        
        //verification des resultats
        verifier(5.0, adv.getVie(), "Adversaire ne perd pas le bon nombre de ptVie");
        verifier(5.0, h.getVie(), "Hero ne doit pas perdre de vie");
    }
    
   /**
    * Test methode subirFrappe
    */
   @Test
    public void test_3_a_subirFrappe()
    {
        //depart
        Hero h = new Hero("nom_hero");
        
        //test
        h.subirFrappe(2);
        
        //verification des resultats
        verifier(3.0, h.getVie(), "Hero ne perd pas le bon nombre de ptvie");
        
        //test degats plus eleve que les ptvie
        h.subirFrappe(10);
        
        //verification des resultats
        verifier(0.0, h.getVie(), "Vie de Hero doit etre a 0");
        
        //depart
        Hero h2 = new Hero("nom_hero");        
        
        //test degats negatifs
        h2.subirFrappe(-10);
        
        //verification des resultats
        verifier(5.0, h2.getVie(), "Les degats ne peuvent etre negatifs");        
    }
    
   /**
    * Test methode ajouterVie 
    */
   @Test
    public void test_4_a_ajouterVie()
    {
        //depart
        Hero h = new Hero("nom_hero");
        
        //test
        h.ajouterVie(5);
        
        //verification des resultats
        verifier(10.0, h.getVie(), "Hero n'a pas le bon nombre de ptvie");
        
        //test nombre negatif
        h.ajouterVie(-10);
        
        //verification des resultats
        verifier(10.0, h.getVie(), "Le hero ne doit pas perdre de point de vie si on entre un nombre negatif");
    }
    
       /**
    * Test methode etreMort 
    */
   @Test
    public void test_5_a_etreMort()
    {
        //depart
        Hero h = new Hero("nom_hero");
        
        Hero h2 = new Hero("nom_hero");
        //test
        h.subirFrappe(5);
        
        //verification des resultats
        verifier(0.0, h.getVie(), "Hero n'a pas le bon nombre de ptvie");
        verifier(true, h.etreMort(), "Hero doit etre considere comme mort");
        
        verifier(5.0, h2.getVie(), "Hero n'a pas le bon nombre de ptvie");
        verifier(false, h2.etreMort(), "Hero doit etre considere comme mort");
    }
}
