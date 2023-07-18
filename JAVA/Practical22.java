import java.util.Scanner;

public class Practical22 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();

        System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
    }
}
