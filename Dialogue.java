/**
 * Manipule le dialogue durant le jeu
 * 
 * @author Amir (edit Jerry)
 * @version 1.0
 */
public abstract class Dialogue
{
    protected Room curentRoom;
    protected Hero hero ; 
    protected Objet objet ;
    /**
     * Constructeur d'objet Dialogue
     * @param rm la Room concernée par le dialogue
     * @param pr le Hero concerné par le dialogue
     */
    public Dialogue(Room rm, Hero pr, Objet obj)
    {
        this.curentRoom = rm ; 
        this.hero = pr ;
        this.objet = obj ;

    }
    
    public abstract void dialogueMaker();
}