package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Porygon extends Pokemon {
    public Porygon(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(65, 60, 70, 85, 75, 40);
        
        addMove(new Psybeam());
        addMove(new Psychic());
    }
}