
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero implements Personnage
{
    
	/**
	 * attributs de Hero
	 */
	 private String nom ;
	 private double ptVie ;
	/**
	 * constructeur
	 */
	 public Hero (String n) 
	 {
		this.nom = n ;
		this.ptVie = 5.00 ;
	 }
	 /**
	 * méthode getNon qui terourne le nom du personnage
	 */
	 public String getNom() {
		 return this.nom ;
	 }
	 /**
	 * méthode etreMort qui terourne si le personnage est mort ou pas
	 */
	 public boolean etreMort() {
		 return (this.ptVie <= 0 ) ;
	 }
	 /**
	 * méthode getVie qui terourne les points de vie du personnage
	 */
	 public double getVie() {
		 return this.ptVie ;
	 }
	 /**
	 * méthode getVie qui terourne les points de vie du personnage
	 */
	 public void ajouterVie (double num) {
		 this.ptVie = this.ptVie + num ;
		
	 }
	  public double subirFrappe (double coup) {
		 this.ajouterVie (- coup) ;
		 double blessure = this.getVie () / 2 ;
		 return blessure ;
	 }
	 /**
	 * méthode attaquer quand un monstre attaque un autre personnage
	 */
	 public void attaquer (Personnage v) {
		 double coup = getVie () / 2 ;
		 double blessure = v.subirFrappe (coup) ;
		 this.ajouterVie (-blessure) ;
	 }
	 
}      