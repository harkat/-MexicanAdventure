import java.util.Random;

/**
 * Fournit des moyens de randomization
 * lors de la génération des instances
 * 
 * @author  Groupe 6
 * @version V2.0
 */
public class Randomizer
{
    /**
     * pour generer des valeurs aleatoires
     */
    private static final Random RAND = new Random();

    /**
     * Constructor for objects of class Randomizer
     */
    private Randomizer()
    {
    }

    /**
     * Provide a random generator.
     * @return A random object.
     */
    public static Random getRandom()
    {
        return new Random();
    }
}
