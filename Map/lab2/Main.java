package lab2;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        // Create a new battle
        Battle b = new Battle();
        
        // Team 1: Zygarde, Buneary, Lopunny
        Zygarde zygarde = new Zygarde("Zygarde", 50);
        Buneary buneary = new Buneary("Buneary", 30);
        Lopunny lopunny = new Lopunny("Lopunny", 40);
        
        // Team 2: Porygon, Porygon2, Porygon-Z
        Porygon porygon = new Porygon("Porygon", 25);
        Porygon2 porygon2 = new Porygon2("Porygon2", 35);
        PorygonZ porygonZ = new PorygonZ("Porygon-Z", 45);
        
        // Add Pokémon to teams
        b.addAlly(zygarde);
        b.addAlly(buneary);
        b.addAlly(lopunny);
        
        b.addFoe(porygon);
        b.addFoe(porygon2);
        b.addFoe(porygonZ);
        
        // Start the battle
        System.out.println("=== POKÉMON BATTLE START ===");
        System.out.println("Team 1: Zygarde, Buneary, Lopunny");
        System.out.println("Team 2: Porygon, Porygon2, Porygon-Z");
        System.out.println("=============================\n");
        
        b.go();
    }
}