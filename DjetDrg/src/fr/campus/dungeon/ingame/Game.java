package fr.campus.dungeon.ingame;
import fr.campus.dungeon.boardcase.*;
import java.util.ArrayList;

public class Game {
    ArrayList<Case> list = new ArrayList();

    public void generateList() {

        list = new ArrayList<>();

        list.add(new EmptyCase());
        list.add(new EnemyCase());
        list.add(new AtkCase());
        list.add(new DefCase());

//        for (int i=0; i<list.size(); i++) {
//           myPosition += dice;
//           board -= dice;
//            System.out.println(list.get(i));
//        }
//        for (Case var : list) {
//            System.out.println(var);
//        }
    }

    public void playRound() {
        int dice = 1;
        int board = list.size();
        int myPosition = 0;

        while (myPosition < list.size()) {
            myPosition += dice;
            board -= dice;
            Case currentCase = list.get(myPosition-1);

            System.out.println("******************************");
            System.out.println("Player is : " + myPosition + "/4");
            System.out.println("Rest : " + board);
            System.out.println("Current Case : " + currentCase);
        }
    }

//        int board = 63;
//        int myPosition = 1;

//        try {
//            while (board > 0) {
//                int dice = (int) (Math.random() * 6) + 1;
//                System.out.println("Player do : " + dice);
//
//                int numbCase = dice;
//
//                if (dice > board) {
//                    throw new OutBoardException("Player is out board");
//                    //numbCase = board;
//                }
//
//                myPosition += numbCase;
//                board -= numbCase;
//
//                System.out.println("Player is : " + myPosition + "/64");
//                System.out.println("Rest : " + board);
//
//                if (board == 0) {
//                    System.out.println("You win !");
//                }
//            }
//        } catch (OutBoardException o) {
//            System.out.println(o.getMessage());
//            //o.printStackTrace();
//        }
}
