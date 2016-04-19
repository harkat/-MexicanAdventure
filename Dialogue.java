/**
 * Manipule le dialogue durant le jeu
 * 
 * @author Amir (edit Jerry)
 * @version 1.0
 */
public abstract class Dialogue
{
    /**
     * Room courante concernee par le dialogue
     */
    protected Room curentRoom;
    /**
     * Hero courant (joueur)
     */
    protected Hero hero ; 
    /**
     * Objet concerne par le dialogue
     */
    protected Objet objet ;
    /**
     * Constructeur d'objet Dialogue
     * @param rm la Room concernée par le dialogue
     * @param pr le Hero concerné par le dialogue
     * @param obj l'Objet concerné par le dialogue
     */
    public Dialogue(Room rm, Hero pr, Objet obj)
    {
        this.curentRoom = rm ; 
        this.hero = pr ;
        this.objet = obj ;

    }
    
    /**
     * selecteur de dialogue
     */
    public abstract void dialogueMaker();
}