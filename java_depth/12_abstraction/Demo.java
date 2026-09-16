// Abstraction
// The process of hiding the implementation details and showing only the essential features
// NOTE:
// 1. Represent whateven necessary for the user
// 2. Even if the user doesn't know the implementation details

// Types of abstraction
// 1. low level Abstraction (hiding implementation details)
// 2. high level Abstraction (Separating concerns (seprate what from how)) 
//      - Abstract classes
//      - interfaces

public class Demo {
    public static void main(String[] args) {
        Car car1 = new ElectricCar();
        car1.start();
        car1.accelerate();
        car1.stop();

        System.out.println("------------");

        Car car2 = new FuelCar();
        car2.start();
        car2.accelerate();
        car2.stop();
    }    
}

abstract class Car {
    void start (){
        System.out.println("Starting the car at 10km/hr");
    }

    abstract void accelerate ();

    abstract void stop ();
}

class FuelCar extends Car {
    @Override
    void start() {
        System.out.println("Starting the fuel car at 20km/hr");
    }

    @Override
    void accelerate(){
        System.out.println("Accelerating the fuel car at 30km/hr");
    }

    @Override
    void stop(){
        System.out.println("Stopping the fuel car at 40km/hr");
    }
}

class ElectricCar extends Car{
    @Override
    void start() {
        System.out.println("Starting the electric car at 50km/hr");
    }

    @Override 
    void accelerate (){
        System.out.println("Accelerating the electric car at 60km/hr");
    }

    @Override 
    void stop() {
        System.out.println("Stopping the electric car at 70km/hr");
    }
}