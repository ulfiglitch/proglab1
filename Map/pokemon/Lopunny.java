package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Lopunny extends Pokemon {
    public Lopunny(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(65, 76, 84, 54, 96, 105);
        
        addMove(new Rest());
        addMove(new ShadowBall());
        addMove(new ChargeBeam());
        addMove(new LowSweep());
    }
}