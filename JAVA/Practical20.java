public class Practical20 {
    public static void main(String[] args) {
        
    }
}

class A {
    public void print() {
        System.out.println("This is Hierarchical Inheritance");
    }
}

class B extends A {}

class D extends A {}

class E extends D {}

//          C
//         / \
//        D   B
//       /
//      E