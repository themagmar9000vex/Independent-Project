/**
 * The pokemon Blastoise.
 *
 * @author Kush Khanna.
 * @version 1.0
 */
public class Blastoise extends Pokemon
{

    /**
     * Constructs a Blastoise with its base stats and moves.
     */
    public Blastoise(){
        super("Blastoise", Types.WATER, Types.NONE, 315,255,290,340,290,200,"Surf", "Ice Beam", "Withdraw", "Flash Cannon");
    } 
    
    /**
     * Surf - Special water type move that has 90 power.
     * @param opp the enemy pokemon
     * @return the power of the move
     */
        public int move1(Pokemon opp){      
        setCurrentMoveType(Types.WATER);
        return -90;
    }
    /**
     * Ice Beam - Special ice type move that has 90 power.
     * @param opp the enemy pokemon
     * @return the power of the move
     */
    public int move2(Pokemon opp){    
        setCurrentMoveType(Types.ICE);
        return -90;
    }
    /**
     * Withdraw - Status water type move that increases defense.
     * @param opp the enemy pokemon
     * @return the power of the move
     */
    public int move3(Pokemon opp){
        setCurrentMoveType(Types.WATER);
        raiseDef();
        return 0;   
    }
    /**
     * Flash Cannon - Special steel type move that has 80 power.
     * @param opp the enemy pokemon
     * @return the power of the move
     */
    public int move4(Pokemon opp){
        opp.setStatus(StatusEffect.PARALYSIS);
        setCurrentMoveType(Types.STEEL);
        return -80;
    }     
    
}
