package move;
import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }
    
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1.0 / 8.0;
    }
    
    @Override
    protected String describe() {
        return "stabs the target with sharpened stones (high critical-hit ratio)";
    }
}