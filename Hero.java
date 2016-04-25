
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
    private String nom;
    private double ptVie;
    private static final double MAX = 15;
    private int score;
    private Relique[] prise = new Relique[3];
    private Instrument instrument;
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
     * methode getInstrument qui terourne le l'instrument du personnage
     * @return l'instrument du Hero
     */
    public Instrument getInstrument() {
        return this.instrument ;
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
        if (this.ptVie > MAX) this.ptVie = MAX;
    }
    /**
     * permet de calculer les points perdus a cause d'une frappe
     * @param coup la force de l'attaque
     * @return un reel
     */
    public void subirFrappe (double coup) {
        this.ajouterVie (-coup) ;
        double blessure = this.getVie () / 2 ;        
    }
    /**
     * méthode attaquer quand un monstre attaque un autre personnage
     * @param v le Personnage attaqué
     */
    public void attaquer (Personnage v) {
        double coup = getVie () / 2 ;
        v.subirFrappe (coup) ;        
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
    
    /**
     * remplit le tableau par des Relique collectee
     * @param rlq la relique collectee
     */
    public void setPrise(Relique rlq) {
        int i = 0;
        while (i < prise.length && this.prise[i] != null) i++;
        
        if (i < this.prise.length) this.prise[i] = rlq;
    }
    
    private boolean priseEstVide() {
        return (this.prise[0] == null);
    }
    
    private void afficherPrise() {
        int i = 0;
        int val = 0;
        while (i < prise.length && this.prise[i] != null) {
            System.out.print("- " + this.prise[i].getNom() + "  ");
            val = val + this.prise[i].getValeur();
            i++;
        }
        System.out.println();
        System.out.println("d'une valeur totale de " + val + " €");
    }
    
    /**
     * recuper l'instrument
     * @param instr l'instrument recuperer
     */
    public void setInstrument(Instrument instr) {
        this.instrument = instr;
    }
    
    public void setScore(int points) {
        this.score = this.score + points;
    }
    
    public void inventaire() {
        System.out.println("Vous avez : " + this.ptVie + " points de vie");
        System.out.println("Votre score est de : " + this.score);
        if (!priseEstVide()) {
            System.out.println("Vous portez le(s) relique(s) suivant(s) :");
            afficherPrise();
        }
        if (this.instrument != null)
            System.out.println("et vous avez : " + 
                this.instrument.getNom() + " comme instrument");
    }
}      