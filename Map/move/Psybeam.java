package move;
import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {
    public Psybeam() {
        super(Type.PSYCHIC, 65, 100);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.confuse(p);
        }
    }
    
    @Override
    protected String describe() {
        return "attacks with a peculiar ray that may cause confusion";
    }
}