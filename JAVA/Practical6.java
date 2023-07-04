import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num_1 = cin.nextInt();        
        int num_2 = cin.nextInt();
        int num_3 = cin.nextInt();
        
        // Logic
        if (num_1 > num_2 && num_1 > num_3) {
            System.out.println(num_1 + " is largest");
        }
        else if (num_2 > num_3 && num_2 > num_1) {
            System.out.println(num_2 + " is largest");
        }
        else {
            System.out.println(num_3 + " is largest");
        }
        
    }
}
