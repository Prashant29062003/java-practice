class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ElectricCar ec1 = new ElectricCar();
        ec1.start();
        ec1.accelerate();
        ec1.stop();
    }
}

interface Car {
    void start();
    void accelerate();
    void stop();
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("Starting the electric car at 50km/hr");
    }

    public void accelerate() {
        System.out.println("Accelerating the electric car at 60km/hr");
    }

    public void stop() {
        System.out.println("Stopping the electric car at 70km/hr");
    }
}

class FuelCar implements Car {
    public void start() {
        System.out.println("Starting the fuel car at 20km/hr");
    }

    public void accelerate() {
        System.out.println("Accelerating the fuel car at 30km/hr");
    }

    public void stop() {
        System.out.println("Stopping the fuel car at 40km/hr");
    }
}