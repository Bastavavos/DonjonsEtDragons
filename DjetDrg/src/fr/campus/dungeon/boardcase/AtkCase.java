package fr.campus.dungeon.boardcase;

import fr.campus.dungeon.stuff.OffensiveStuff;
import fr.campus.dungeon.stuff.off.Katana;
import fr.campus.dungeon.stuff.off.Knife;
import fr.campus.dungeon.stuff.off.Spell;
import fr.campus.dungeon.stuff.off.Sword;

import java.util.Random;

public class AtkCase implements Case {

    OffensiveStuff offensivestuff;

    public AtkCase() {
        display();
    }

    @Override
    public String toString() {
        return "StuffCase {" + offensivestuff + '}';
    }

    @Override
    public void display() {
        Random random = new Random();
        int stuffChoice = random.nextInt(2);

        if (stuffChoice == 0) {
            this.offensivestuff = new Knife();
        }

        if (stuffChoice == 1) {
            this.offensivestuff = new Katana();
        }
    }
}
