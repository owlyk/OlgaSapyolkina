package homework3;

import java.util.Scanner;

public class Puzzle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Answer the riddle: If I drink, I die. If I eat, I am fine. What am I?");
            String answer = scan.nextLine();
            {
                if (answer.equals("Fire")) {
                    System.out.println("Great!");
                    break;
                } else if (answer.equals("I don’t know")) {
                    System.out.println("Answer: Fire");
                    break;
                } else {
                    System.out.println("Think again");
                }
            }
        }
    }
}


