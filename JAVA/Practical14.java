public class Practical14 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("How many numbers you want to print?");
        int n = cin.nextInt();

        int temp = 1;
        do {
            System.out.println(temp++);
        }
            while (temp != n + 1);
    }
}
