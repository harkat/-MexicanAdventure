/**
 * interface Personnage qui caractérise tous personnages
 * 
 * @author  Groupe 6
 * @version V2.0
 */
public interface Personnage {
    /**
     * permet de calculer les points perdus
     * a cause d'une frappe
     * @param coup la force de l'attaque
     * @return les points perdu
     */
    public double subirFrappe (double coup) ;
    
    /**
    * permet de mettre a jour les points
    * du personnage attaquant et de le personnage attaque
    * apres un attaque
    * @param p la Victime attaque
    */    
    public void attaquer (Personnage p) ;
}