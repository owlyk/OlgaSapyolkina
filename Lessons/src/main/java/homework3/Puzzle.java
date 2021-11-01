package homework3;

import java.util.Scanner;

public class Puzzle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer the riddle: If I drink, I die. If I eat, I am fine. What am I?");
        String answer = scan.nextLine();
    }

    private static void riddleAnswerSwitch(String[] args) {
        String answer = "Fire";
        {
            for (int i = 1; i < 3; i++) {
                switch (answer) {
                    case "Fire":
                        System.out.println("Great!");
                        break;
                    case "I don’t know":
                        System.out.println("Answer: Fire");
                        break;
                    default:
                        System.out.println("Think again");
                }
            }
        }
    }
}


