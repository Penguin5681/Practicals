import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        // Area of a circle 
        Scanner cin = new Scanner(System.in);
        final double PI = 3.14; // Constant Value (similar to const int pi)
        double radius = cin.nextInt();

        System.out.println("Area = " + PI * radius * radius);
    }
}
