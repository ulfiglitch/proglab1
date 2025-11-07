package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Buneary extends Pokemon {
    public Buneary(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 66, 44, 44, 56, 85);
        
        addMove(new Rest());
        addMove(new ShadowBall());
        addMove(new ChargeBeam());
    }
}