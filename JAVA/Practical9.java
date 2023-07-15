import java.util.Scanner;

public class Practical9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n < 0) 
            System.out.println(n + " is negative");
        else    
            System.out.println(n + " is positive");
    }
}
