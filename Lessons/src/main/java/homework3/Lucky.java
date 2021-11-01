package homework3;

import java.util.Random;

public class Lucky {

    public static void main(String[] args) {
        int[] array1 = {15, 8, 24, 41, 9, 84};
        Random rnd = new Random();
        int rndNumber = array1[rnd.nextInt(array1.length)];
        if (rndNumber % 2 == 0) {
            System.out.println("Random number = " + rndNumber + " I am lucky");
        }
        else if (rndNumber % 2 != 0)
        {
        System.out.println("Random number = " + rndNumber + " Run again");
        }
    }
}




