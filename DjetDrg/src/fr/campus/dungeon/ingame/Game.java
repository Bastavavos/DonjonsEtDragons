package fr.campus.dungeon.ingame;

import fr.campus.dungeon.menu.Menu;
import java.util.Scanner;

public class Game {
    public void displayGame() {

        int board = 63;
        int myPosition = 1;

        while (board > 0) {
            int dice = (int)(Math.random() * 6) + 1;
            System.out.println("Player do : " + dice);

            int numbCase = dice;
            if (dice >= board) {
                numbCase = board;
            }
            myPosition += numbCase;
            board -= numbCase;
            System.out.println("Player is : " + myPosition + "/64");
            System.out.println("Rest : " + board);
        }
    }
}
