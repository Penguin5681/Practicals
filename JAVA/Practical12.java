import java.util.Scanner;

public class Practical12 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("How many numbers you want to print?");
        int n = cin.nextInt();
        
        int some_number = 1;
            while (some_number != n + 1) {
                System.out.println(some_number);
                some_number++;
            }
    }
}
