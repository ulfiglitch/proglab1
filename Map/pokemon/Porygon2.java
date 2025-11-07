package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Porygon2 extends Pokemon {
    public Porygon2(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(85, 80, 90, 105, 95, 60);
        
        addMove(new Psybeam());
        addMove(new Psychic());
        addMove(new DefenseCurl());
    }
}