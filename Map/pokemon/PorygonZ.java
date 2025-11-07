package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class PorygonZ extends Pokemon {
    public PorygonZ(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(85, 80, 70, 135, 75, 90);
        
        addMove(new Psybeam());
        addMove(new Psychic());
        addMove(new DefenseCurl());
    }
}