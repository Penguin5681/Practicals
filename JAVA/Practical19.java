class Vehicle {
    private String make;
    private int year;
    private String color;
    private String model;

    public Vehicle(String make, int year, String color, String model) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void getInfo() {
        System.out.println("Manufactured by: " + make);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    private String bodyStyle;

    public Car(String make, int year, String color, String model, String bodyStyle) {
        super(make, year, color, model);
        this.bodyStyle = bodyStyle;
    }

    public void getCarInfo() {
        getInfo();
        System.out.println("Body Style: " + bodyStyle);
    }
}

public class Practical19 {
    public static void main(String[] args) {
        Car Elantra = new Car("Hyundai", 2019, "Blue", "Elantra", "Sedan");
        Elantra.getCarInfo();
    }    
}
