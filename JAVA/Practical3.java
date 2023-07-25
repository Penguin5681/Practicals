import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        // Simple Interest  = P * R * N / 100
        Scanner cin = new Scanner(System.in);
        double P, R, N;
        P = cin.nextDouble();
        R = cin.nextDouble();
        N = cin.nextDouble();

        System.out.println("SI = " + P * R * N * 0.01); // 1 / 100 = 0.01
    }
}
