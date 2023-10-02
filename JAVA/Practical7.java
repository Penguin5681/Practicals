import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                System.out.print(" * ");
            }
                System.out.println();
        }
    }
}

class Patterns {
    // Pattern p2, p3 makes your brain explode
    public void pattern_1(int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                System.out.print(" * ");
            }
                System.out.println();
        }
    }

    // Pattern 1: 
    // *  *  *  *  * 
    // *  *  *  * 
    // *  *  * 
    // *  * 
    // *

    public void pattern_2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int white_space = (2 * n) - (2 * i);

            for (int k = 1; k <= white_space; k++) 
                System.out.print(" ");
            
            for (int l = 1; l <= i; l++) 
                System.out.print("*");
                System.out.print("\n");
        }

        for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                int white_space = (2 * n) - (2 * i);

                for (int k = 1; k <= white_space; k++) 
                    System.out.print(" ");

                for (int l = 1; l <= i; l++) 
                    System.out.print("*");
                    System.out.print("\n");
            }
        }

        // Pattern 2:
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        
        public void pattern_3(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                int white_space = (2 * n) - (2 * i);
            
                for (int k = 1; k <= white_space; k++) 
                    System.out.print(" ");
                
                for (int l = 1; l <= i; l++) 
                    System.out.print(" * ");
                    System.out.print("\n");
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            int white_space = (2 * n) - (2 * i);
            for (int k = 1; k <= white_space; k++) 
                System.out.print(" ");
            for (int l = 1; l <= i; l++) 
                System.out.print(" * ");
                System.out.print("\n");
        }

        // Pattern 3
        // *          * 
        // *  *        *  * 
        // *  *  *      *  *  * 
        // *  *  *  *    *  *  *  * 
        // *  *  *  *  *  *  *  *  *  * 
        // *  *  *  *  *  *  *  *  *  * 
        // *  *  *  *    *  *  *  * 
        // *  *  *      *  *  * 
        // *  *        *  * 
        // *          * 
    }
}   
