public class Practical16 {
    public static void main(String[] args) {
        Person p1 = new Person("Pranav", 20);
        p1.displayInfo();
    }
}

class Person {
    private String name; int age; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }
}
