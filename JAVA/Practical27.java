public class Practical27 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 1};
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        System.out.println("Result of subtraction: " + result);
    }
}
