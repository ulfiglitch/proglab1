package move;
import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
    public DefenseCurl() {
        super(Type.NORMAL, 0, 100);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    
    @Override
    protected String describe() {
        return "curls up to raise its Defense";
    }
}