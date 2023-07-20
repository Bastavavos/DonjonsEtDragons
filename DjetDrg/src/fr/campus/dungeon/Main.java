package fr.campus.dungeon;
import fr.campus.dungeon.character.Character;
import fr.campus.dungeon.character.type.Warrior;
import fr.campus.dungeon.menu.Menu;
import fr.campus.dungeon.character.type.Wizard;
import fr.campus.dungeon.stuff.DefensiveStuff;
import fr.campus.dungeon.stuff.OffensiveStuff;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        mainMenu.displayMainMenu();
    }
}


