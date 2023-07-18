public class Practical18 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();  
    }
}

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Starting the car.");
    }
}
