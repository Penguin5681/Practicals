import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        // Even Odd
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        }
        else {
            System.out.println(n + " is odd");
        }
    }
}
