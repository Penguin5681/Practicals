class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the constructor of the superclass (Animal)
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class Practical31 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.displayInfo(); // Calls the displayInfo method in the Dog class
        myDog.eat(); // Calls the eat method from the superclass (Animal)
        myDog.bark(); // Calls the bark method in the Dog class
    }
}