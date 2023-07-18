public class Practical21 {

    final static double pi = 3.14;
    public static void main(String[] args) {
        double radius = 10.5;

        int side = 4;
        
        int length = 10;
        int breadth = 25;

        System.out.println("Area of Circle: " + getArea(radius));
        System.out.println("Area of Square: " + getArea(side));
        System.out.println("Area of Rectangle: " + getArea(length, breadth));
    }

    static double getArea(double radius) {
        return pi * radius * radius;
    }

    static int getArea(int side) {
        return side * side;
    }

    static int getArea(int length, int breadth) {
        return length * breadth;
    }
}