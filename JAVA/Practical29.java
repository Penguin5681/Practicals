abstract class AbstractClass {
    abstract void display();
}

public class Practical29 extends AbstractClass {
    public void display() {
        System.out.println("This is an implementation of the abstract class method.");
    }

    public static void main(String[] args) {
        Practical29 obj = new Practical29();
        obj.display();
    }
}
