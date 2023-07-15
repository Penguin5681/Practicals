public class Practical19 {
    public static void main(String[] args) {
        D obj = new D();
        obj.print();
    }
}

class A {
    public void print() {
        System.out.println("This is Multilevel Inheritance");
    }
}

class B extends A {}

class C extends B {}

class D extends C {}