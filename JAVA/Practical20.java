public class Practical20 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing.");
    }
}
