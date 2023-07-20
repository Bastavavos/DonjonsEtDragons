package fr.campus.dungeon.enemy;

import fr.campus.dungeon.character.Character;

public class Goblin extends Character {
    public Goblin(String name) {
        super(name);
        setHpPoints(10);
        setAtkPoints(10);
    }
}
