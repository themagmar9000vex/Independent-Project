import java.util.Random;
/**
 * A class that represents a random number generator.
 *
 * @author Kush Khanna
 * @version 1.0
 */
public class RNG
{

    /**
     * Checks whether or not to apply the status effect.
     * @return true if the status is applied, and false otherwise
     */
    public static boolean applyStatus(){
        Random rand = new Random();
        int n = rand.nextInt(99) + 1;
        return n >= 50;
    }
    
    /**
     * Checks whether or not to apply the status effect given it is a side effect of a damaging move.
     * @return true if the status is applied, and false otherwise
     */
    public static boolean sideStatus(){
        Random rand = new Random();
        int n = rand.nextInt(99) + 1;
        return n >= 70;
    }
    
    /**
     * Checks whether a move is a crit or not.
     * @return 1.5 if it is a crit, and 1 if it is not
     */
    public static double isCrit(){
        Random rand = new Random();
        int n = rand.nextInt(99) + 1;
        if(n>=80){return 1.5;}
        else{return 1;}        
    }
    
    /**
     * Picks a random move for the opponent.
     * @return 1-4
     */
    public static int pickMove(){
        Random rand = new Random();
        return rand.nextInt(3) + 1;
    }
    
    /**
     * Picks a random trainer to face.
     * @return 1-3
     */
    public static int pickTrainer(){
        Random rand = new Random();
        return rand.nextInt(2) + 1;
    }
}
