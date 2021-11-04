package homework4;

import homework4.details.Engine;
import homework4.professions.Driver;
import homework4.vehicles.SportCar;
import homework4.vehicles.Truck;

public class Main {

    public static void main(String[] args)
    {
        Driver driver1 = new Driver("Jack",6,35,"Jack White");
        Engine engine1 = new Engine(500, "Nissan");
        Driver driver2 = new Driver("Jimi",25,56,"Jimi Hendrix");
        Engine engine2 = new Engine(800, "Mercedes-Benz");
        SportCar sportCar = new SportCar("Skyline","Sedan",500,driver1,engine1,340);
        Truck truck = new Truck("Unimog","Lorry",2000,driver2,engine2,30000);

        System.out.println(sportCar);
        System.out.println(truck);

    }
}
