public class Practical18 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("The mammal is walking.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}
