package homework2;


import java.util.Scanner;

public class Building
{

    public static void main (String [] args)
    {
        System.out.println("Enter the height of the building in meters");
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        System.out.println("Enter the number of floors");
        int count = scan.nextInt();
        System.out.println("The height building " + height + "m and " + count +  " floors");

    }
}