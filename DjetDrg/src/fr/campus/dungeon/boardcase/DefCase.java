package fr.campus.dungeon.boardcase;

import fr.campus.dungeon.stuff.DefensiveStuff;
import fr.campus.dungeon.stuff.def.HealingPlant;
import fr.campus.dungeon.stuff.def.Immunity;
import fr.campus.dungeon.stuff.def.Potion;
import fr.campus.dungeon.stuff.def.Shield;

import java.util.Random;

public class DefCase implements Case {

    DefensiveStuff defensivestuff;

    public DefCase() {
        display();
    }

    @Override
    public String toString() {
        return "StuffCase {" + defensivestuff + '}';
    }

    @Override
    public void display() {
        Random random = new Random();
        int stuffChoice = random.nextInt(2);

        if (stuffChoice == 0) {
            this.defensivestuff = new Immunity();
        }

        if (stuffChoice == 1) {
            this.defensivestuff = new HealingPlant();
        }
    }
}

