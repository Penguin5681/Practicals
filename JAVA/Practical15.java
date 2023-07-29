import java.util.Scanner;

public class Practical15 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = cin.nextInt();
        int b = cin.nextInt();

        System.out.println("Choose operation: ");
        char ch = cin.next().charAt(0);
        
            switch (ch) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '/': System.out.println(a / b); break;
                case '*': System.out.println(a * b);
                default: System.out.println("Enter a valid case: + - / *");
            }
    }
}
