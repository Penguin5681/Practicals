import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int height = cin.nextInt();
        int age = cin.nextInt();

        if (height > 120) {
            System.out.println("You can ride");
            if (age < 12) 
                System.out.println("Pay 12$");
                
            else if (age<= 18)
                System.out.println("Pay 7$");
            
            else 
                System.out.println("Pay 5$");
        }
        else {
            System.out.println("You Can't ride");   
        }
    }
}
