package fr.campus.dungeon.menu;

import fr.campus.dungeon.character.Character;
import fr.campus.dungeon.ingame.Game;

import java.util.Scanner;

public class Menu {
    Character mainCharacter;
    Game mainGame;
    String type = "";
    String name = "";
    public Menu(){
        System.out.println("Welcome on Dungeon & Dragon");
    }

    public void displayMainMenu() {

        while (true) {

            System.out.println("1 - Create character");
            System.out.println("2 - Modify my character");
            System.out.println("3 - Start game");
            System.out.println("4 - Quit game");

            Scanner console = new Scanner(System.in);
            int userChoice = console.nextInt();
            System.out.println("Choice : " + userChoice);

            if (userChoice == 1) {

                this.mainCharacter = createCharacter();
                System.out.println(this.mainCharacter);

            } else if (userChoice == 2 && !type.isEmpty() && !name.isEmpty()) {

                System.out.println("Display character information or modify my information ? [D/M]");
                Scanner modification = new Scanner(System.in);
                String userChoice2 = modification.nextLine();
                System.out.println("Choice : " + userChoice2);
                if (userChoice2.equals("D")) {
                    System.out.println(this.mainCharacter);

                } else if (userChoice2.equals("M")) {
                    type = "";
                    name = "";
                    this.mainCharacter = createCharacter();
                    System.out.println(this.mainCharacter);
                }

            } else if (userChoice == 3 && !type.isEmpty() && !name.isEmpty()) {

                this.mainGame = new Game();
                this.mainGame.displayGame();

                while (true) {

                    System.out.println("Restart or Quit Game ? [R/Q]");
                    Scanner endgame = new Scanner(System.in);
                    String userChoice3 = endgame.nextLine();

                    if (userChoice3.equals("R")) {
                        this.mainGame.displayGame();

                    } else if (userChoice3.equals("Q")) {
                        break;
                    }
                }

            } else if (userChoice == 4) {

                System.out.println("Quit game ? [Y/N]");
                Scanner forQuit = new Scanner(System.in);
                String userChoiceQuit = forQuit.nextLine();
                System.out.println("Choice : " + userChoiceQuit);
                if (userChoiceQuit.equals("Y")) {
                    break;
                }
            } else {
                System.out.println("Veuillez créer un personnage");
            }
        }
    }

    public Character createCharacter() {

        Scanner myObj = new Scanner(System.in);

        while (type.isEmpty() || (!type.equals("warrior") && !type.equals("wizard")) ) {

            System.out.println("Select your type : warrior or wizard");
            type = myObj.nextLine();
        }

        System.out.println("Enter your name : ");
        name = myObj.nextLine();

        Character newCharacter = new Character(name, type);
        return newCharacter;
    }
}



