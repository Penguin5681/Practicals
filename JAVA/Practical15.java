import java.util.Scanner;

public class Practical15 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char ch = cin.next().charAt(0);
            switch (ch) {
                case '+': System.out.println("This is +"); break;
                case '-': System.out.println("This is -"); break;
                case '/': System.out.println("This is /"); break;
                default: System.out.println("Enter a valid case: + - /");
            }
    }
}
