public class Practical18 {
    public static void main(String[] args) {
        Something obj = new Something();
        obj.print();        
    }
}

class Shape {
    void print() {
        System.out.println("This is a Square");
    }
}

class Something extends Shape {}