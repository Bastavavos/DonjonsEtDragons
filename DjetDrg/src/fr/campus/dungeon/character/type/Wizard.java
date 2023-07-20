package fr.campus.dungeon.character.type;

import fr.campus.dungeon.character.Character;
import fr.campus.dungeon.stuff.def.Potion;
import fr.campus.dungeon.stuff.off.Spell;

public class Wizard extends Character {

    public Wizard(String name) {
        super(name);
        setHpPoints(6);
        setAtkPoints(15);
        setBasicOffItem(new Spell());
        setBasicDefItem(new Potion());
    }
    @Override
    public String toString() {
        return "Wizard : " + super.toString();
    }
}
