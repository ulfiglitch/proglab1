package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Zygarde extends Pokemon {
    public Zygarde(String name, int level) {
        super(name, level);
        setType(Type.DRAGON, Type.GROUND);
        setStats(108, 100, 121, 81, 95, 95);
        
        addMove(new Confide());
        addMove(new RockSlide());
        addMove(new DoubleTeam());
        addMove(new StoneEdge());
    }
}