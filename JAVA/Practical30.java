interface MyInterface {
    void printMessage();
}

public class Practical30 implements MyInterface {
    public void printMessage() {
        System.out.println("This is an implementation of the interface method.");
    }

    public static void main(String[] args) {
        Practical30 obj = new Practical30();
        obj.printMessage();
    }
}
