package homework5;

public class Main {

    public static void main(String[] args)
    {
        RubberDuck rubberDuck = new RubberDuck("RubberDuck","can swim", "made of rubber","has a beak" );
        Martin martin = new Martin("Martin","eats mosquitos","has a beak" );
        Swan swan = new Swan("Swan","eats grass");
        Platypus platypus = new Platypus("Platypus","mammal");


        System.out.println(rubberDuck);
        System.out.println(martin);
        System.out.println(swan);
        System.out.println(platypus);


    }


}

