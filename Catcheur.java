
/**
 * Represente un Catcheur
 * 
 * @author  Groupe 6
 * @version V2.0
 */
public class Catcheur extends Adversaire
{
    
    /**
     * constructeur herite celui de la classe Adversaire
     * @param p points de vie du Monstre cree
     */
    public Catcheur(double p)
    {
        super(p);
    }
    
    /**
     * constructeur herite celui de la classe Adversaire
     * @param p points de vie du Monstre cree
     */
    public Catcheur(String nom, double p)
    {
        super(nom, p);
    }

    /**
     * permet de mettre a jour les points
     * du Catcheur attaquant et de le Personnage attaque
     * apres une attaque
     * @param p le Personnage attaque
     */
    public void attaquer(Personnage p) {
        double coup = 1;
        p.subirFrappe(coup);               
    }
    
    /**
     * permet de calculer les points perdus a cause d'une frappe
     * @param coup la force de l'attaque
     * @return un reel
     */
    public void subirFrappe(double coup) {
        this.ajouterVie(-coup);
    }
    
    /**
     * méthode etreMort qui retourne si le catcheur est mort ou pas
     * @return vrai si le Hero est mort
     */
    public boolean etreMort() {
        return (this.ptsVie <= 0 ) ;
    }
    
    /**
     * permet de recuperer les points du Personnage
     * @return un reel
     */
    public double getVie() {
        return this.ptsVie;
    }
    
    /**
     * permet de mettre a jour les points du Personnage
     * @param num les points a rajouter
     */
    public void ajouterVie(double num) {
        this.ptsVie = (int)(this.ptsVie + num);
    }
}
