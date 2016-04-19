
/**
 * Represente le Hero, c'est le Personnage
 * qui incarne le joueur
 * 
 * @author  Groupe 6
 * @version V2.0
 */
public class Hero implements Personnage
{
    
    /**
     * attributs de Hero
     */
    private String nom ;
    private double ptVie ;
    private int score ;
    private Relique[] prise = new Relique[3] ;
    /**
     * constructeur Hero
     * @param n le nom du Hero
     */
    public Hero (String n) 
    {
        this.nom = n ;
        this.ptVie = 5.00 ;
    }
    /**
     * methode getNon qui terourne le nom du personnage
     * @return le nom du Hero
     */
    public String getNom() {
        return this.nom ;
    }
    /**
     * méthode etreMort qui terourne si le personnage est mort ou pas
     * @return vrai si le Hero est mort
     */
    public boolean etreMort() {
        return (this.ptVie <= 0 ) ;
    }
    /**
     * methode getVie qui terourne les points de vie du personnage
     * @return les points de vie du Hero
     */
    public double getVie() {
        return this.ptVie ;
    }
    /**
     * methode getVie qui terourne les points de vie du personnage
     * @param num les points de vie a ajouter
     */
    public void ajouterVie (double num) {
        this.ptVie = this.ptVie + num ;
    }
    /**
     * permet de calculer les points perdus a cause d'une frappe
     * @param coup la force de l'attaque
     * @return un reel
     */
    public double subirFrappe (double coup) {
        this.ajouterVie (-coup) ;
        double blessure = this.getVie () / 2 ;
        return blessure ;
    }
    /**
     * méthode attaquer quand un monstre attaque un autre personnage
     * @param v le Personnage attaqué
     */
    public void attaquer (Personnage v) {
        double coup = getVie () / 2 ;
        double blessure = v.subirFrappe (coup) ;
        this.ajouterVie (-blessure) ;
    }
    
    /**
     * méthode pour savoir si le héro posséde bien les 3 reliques
     * @return true si il possède les 3 reliques
     */
    public boolean possederRelique() {
        boolean res = true;
        for (int i = 0; i < 3; i++) {
            if (prise[i] == null) {
                res = false;
            }
        }
        return res;
    }
}      