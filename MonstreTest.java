

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
        Monstre mo = new Monstre(10);
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
        Monstre mo = new Monstre(10);
        
        //verifition des resultats
        verifier(10.0, mo.getVie(), "Probleme constructeur pv attendu 10");
        
        //test
        Monstre mo2 = new Monstre(-10);
        
        //verification des resultats
        verifier(10.0, mo2.getVie(), "Probleme constructeur pv ne peuvent etre negatif, pv a 10 par defaut");        
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
        Monstre mo = new Monstre(10);
        Monstre adv = new Monstre(10); // adversaire valide 10 ptVie
        
        //test
        mo.attaquer(adv);
        
        //verification des resultats
        verifier(5.0, adv.getVie(), "Adversaire ne perd pas le bon nombre de ptVie");
        verifier(10.0, mo.getVie(), "Monstre ne doit pas perdre de vie");
    }
    
   /**
    * Test methode subirFrappe
    */
   @Test
    public void test_3_a_subirFrappe()
    {
        //depart
        Monstre mo = new Monstre(10);
        
        //test
        mo.subirFrappe(5);
        
        //verification des resultats
        verifier(5.0, mo.getVie(), "Monstre ne perd pas le bon nombre de ptvie");
        
        //test degats plus eleve que les ptvie
        mo.subirFrappe(10);
        
        //verification des resultats
        verifier(0.0, mo.getVie(), "Vie de Monstre doit etre a 0");
        
        //depart
        Monstre mo2 = new Monstre(10);        
        
        //test degats negatifs
        mo2.subirFrappe(-10);
        
        //verification des resultats
        verifier(10.0, mo2.getVie(), "Les degats ne peuvent etre negatifs");        
    }
    
   /**
    * Test methode ajouterVie 
    */
   @Test
    public void test_4_a_ajouterVie()
    {
        //depart
        Monstre mo = new Monstre(10);
        
        //test
        mo.ajouterVie(5);
        
        //verification des resultats
        verifier(15.0, mo.getVie(), "Monstre n'a pas le bon nombre de ptvie");
        
        //test nombre negatif
        mo.ajouterVie(-10);
        
        //verification des resultats
        verifier(15.0, mo.getVie(), "Le monstre ne doit pas perdre de point de vie si on entre un nombre negatif");
    }
}


