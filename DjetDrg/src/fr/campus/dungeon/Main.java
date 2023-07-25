package fr.campus.dungeon;
import fr.campus.dungeon.database.Connect;
import fr.campus.dungeon.menu.Menu;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Menu mainMenu = new Menu();
        mainMenu.displayMainMenu();
//        Connect connexion = new Connect();
    }
}


