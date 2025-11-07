package move;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect restEffect = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
        p.addEffect(restEffect);
    }
    
    @Override
    protected String describe() {
        return "goes to sleep for 2 turns to fully restore HP";
    }
}