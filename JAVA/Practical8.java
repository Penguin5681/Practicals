import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int height = cin.nextInt();
        int age = cin.nextInt();

        if (height > 180 && age > 18) {
            System.out.println("You can enjoy the roller coaster ride!");
        }
    }
}
