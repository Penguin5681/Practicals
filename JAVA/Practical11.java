import java.util.Scanner;

public class Practical11 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float temperature = cin.nextFloat();

        if (temperature < 30.0 && temperature > 0)
            System.out.println("Nice Weather");
        else if (temperature > 30 && temperature < 50)
            System.out.println("hOT outside!");
        else 
            System.out.println("Too Cold");
    }
}
