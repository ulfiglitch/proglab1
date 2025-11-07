package move;
import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    
    @Override
    protected String describe() {
        return "makes a swift attack on the target's legs, lowering its Speed";
    }
}