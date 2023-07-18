import java.util.Scanner;
import java.util.ArrayList;

public class Practical23 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();

        do {
            System.out.println("1: Enter Elements to list: ");
            System.out.println("2: Remove from list");
            System.out.println("3: Display the list");
            System.out.println("4: Get sum of elements of the list: ");
            System.out.println("5: Get Average");
            System.out.println("6: Exit");

            int ch = cin.nextInt(); 
            if (ch == 6) break;
            switch (ch) {
                case 1: 
                    System.out.println("How many elements you wanna add? ");
                    int n = cin.nextInt();
                    for (int i = 0; i < n; ++i) {
                        System.out.println("Element: " + (i + 1) + ": ");
                        int tempNum = cin.nextInt();
                        li.add(tempNum);
                    }
                    break;

                case 2:
                    System.out.println("Enter the index of element to remove from list");
                    int idx = cin.nextInt();
                    li.remove(idx);
                    break;

                case 3:
                    System.out.println(li);
                    break;

                case 4:
                    int sum = 0;
                    for (int i : li)
                        sum += i;
                    System.out.println("Sum: " + sum);
                    break;
                
                case 5:
                    int tempSum = 0;
                    for (int i : li)
                        tempSum += i;
                    System.out.println("Average: " + (tempSum / li.size()));
                    break;

                default: System.out.println("Invalid input :("); 
                            break;
            }
        } while (true);
    }
}