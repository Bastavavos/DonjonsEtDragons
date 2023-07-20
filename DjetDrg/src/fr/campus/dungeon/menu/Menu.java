package fr.campus.dungeon.menu;

import fr.campus.dungeon.character.Character;
import fr.campus.dungeon.character.type.Warrior;
import fr.campus.dungeon.character.type.Wizard;
import fr.campus.dungeon.ingame.Game;

import java.util.Scanner;

public class Menu {
    Character mainCharacter;
    Game mainGame;
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

                createCharacter();
                System.out.println(mainCharacter.toString());

            } else if (userChoice == 2 && !name.isEmpty()) {

                System.out.println("Display character information or modify my information ? [D/M]");
                Scanner modification = new Scanner(System.in);
                String userChoice2 = modification.nextLine();
                System.out.println("Choice : " + userChoice2);
                if (userChoice2.equalsIgnoreCase("D")) {
                    System.out.println(mainCharacter);

                } else if (userChoice2.equalsIgnoreCase("M")) {
                    name = "";
                    createCharacter();
                    System.out.println(mainCharacter);
                }

            } else if (userChoice == 3 && !name.isEmpty()) {

                this.mainGame = new Game();
                this.mainGame.generateList();
                this.mainGame.playRound();

                while (true) {

                    System.out.println("Restart or Quit Game ? [R/Q]");
                    Scanner endgame = new Scanner(System.in);
                    String userChoice3 = endgame.nextLine();

                    if (userChoice3.equalsIgnoreCase("R")) {
                        this.mainGame.generateList();
                        this.mainGame.playRound();

                    } else if (userChoice3.equalsIgnoreCase("Q")) {
                        break;
                    }
                }

            } else if (userChoice == 4) {

                System.out.println("Quit game ? [Y/N]");
                Scanner forQuit = new Scanner(System.in);
                String userChoiceQuit = forQuit.nextLine();
                System.out.println("Choice : " + userChoiceQuit);
                if (userChoiceQuit.equalsIgnoreCase("Y")) {
                    break;
                }
            } else {
                System.out.println("Veuillez créer un personnage");
            }
        }
    }

    public void createCharacter() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name : ");

        name = myObj.nextLine();

        System.out.println("Select your type : warrior or wizard");
        String type = myObj.nextLine();

        if (type.equalsIgnoreCase("warrior")){
            this.mainCharacter = new Warrior(name);
        }
        if (type.equalsIgnoreCase("wizard")){
            this.mainCharacter = new Wizard(name);
        }
    }
}



