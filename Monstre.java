
/**
 * Represente un Monstre
 * 
 * @author  Groupe 6
 * @version V2.0
 */
public class Monstre extends Adversaire
{
    /**
     * constructeur herite celui de la classe Adversaire
     * @param p points de vie du Monstre cree
     */
    public Monstre(double p)
    {
        super(p);
    }

    /**
     * permet de mettre a jour les points
     * du Monstre attaquant et de le Personnage attaque
     * apres un attaque
     * @param p le Personnage attaque
     */
    public void attaquer(Personnage p) {
        double coup = this.getVie() / 2;
        double blessure = p.subirFrappe(coup);
        this.ajouterVie(-blessure);
    }

    /**
     * permet de calculer les points perdus a cause d'une frappe
     * @param coup la force de l'attaque
     * @return un reel
     */
    public double subirFrappe(double coup) {
        this.ajouterVie(-coup);
        double blessure = this.getVie() / 2;
        return blessure;
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