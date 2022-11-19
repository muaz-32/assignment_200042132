package assignment2.independence;

public class Car {
    String model;
    int numOfSeats;
    int topSpeed;
    int fuelPerKilometer;
    int findFuelAmount(int kilometers){
        return kilometers * fuelPerKilometer;
    }
}

/*--------------------------------Explanation------------------------------------
In this example, the Car class and the Phone class have no relation between them.
None of them depend on the other. This is independence coupling.
 */