
/**
 * contient la methode principale
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Principale
{
    public static void main(String[] args){
        Carte carte = new Carte();
        Game game = new Game(carte);
        game.play();        
    }
}
