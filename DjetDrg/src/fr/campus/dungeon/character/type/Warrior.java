package fr.campus.dungeon.character.type;

import fr.campus.dungeon.character.Character;
import fr.campus.dungeon.stuff.def.Shield;
import fr.campus.dungeon.stuff.off.Sword;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        setHpPoints(10);
        setAtkPoints(10);
        setBasicOffItem(new Sword());
        setBasicDefItem(new Shield());
    }
    @Override
    public String toString() {
        return "Warrior : " + super.toString();
    }
}

