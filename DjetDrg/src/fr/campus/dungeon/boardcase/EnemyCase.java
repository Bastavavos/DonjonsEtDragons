package fr.campus.dungeon.boardcase;

import fr.campus.dungeon.enemy.Goblin;
import fr.campus.dungeon.enemy.Troll;

import fr.campus.dungeon.character.Character;
import java.util.Random;

public class EnemyCase implements Case {

    Character enemy;

    public EnemyCase() {
        display();

    }
        @Override
        public String toString () {
            return "EnemyCase {" + enemy + '}';
        }

    @Override
    public void display() {
        Random random = new Random();
        int enemyChoice = random.nextInt(2);

        if (enemyChoice == 0) {
            this.enemy = new Goblin("Goblin");
        }

        if (enemyChoice == 1) {
            this.enemy = new Troll("Troll");
        }
    }
}

