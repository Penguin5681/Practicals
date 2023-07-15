import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        if (n % 2 == 0) {
            if (n > 0)
                System.out.println(n + " is even and positive");
        }
    }
}
