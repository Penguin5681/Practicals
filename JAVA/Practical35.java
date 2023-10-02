public class Practical35 {
    public static void main(String[] args) {
        // Math functions

        // Square root
        double sqrtResult = Math.sqrt(25.0);
        System.out.println("Square root of 25: " + sqrtResult);

        // Absolute value
        int absResult = Math.abs(-42);
        System.out.println("Absolute value of -42: " + absResult);

        // Power
        double powerResult = Math.pow(2, 3);
        System.out.println("2^3 (2 raised to the power of 3): " + powerResult);

        // Trigonometric functions (in radians)
        double sinResult = Math.sin(Math.PI / 6); // sin(π/6)
        double cosResult = Math.cos(Math.PI / 3); // cos(π/3)
        double tanResult = Math.tan(Math.PI / 4); // tan(π/4)
        System.out.println("sin(π/6): " + sinResult);
        System.out.println("cos(π/3): " + cosResult);
        System.out.println("tan(π/4): " + tanResult);

        // Ceiling and floor
        double ceilResult = Math.ceil(7.25);
        double floorResult = Math.floor(7.75);
        System.out.println("Ceiling of 7.25: " + ceilResult);
        System.out.println("Floor of 7.75: " + floorResult);

        // Random numbers
        double randomValue = Math.random(); // Random value between 0 (inclusive) and 1 (exclusive)
        System.out.println("Random value between 0 and 1: " + randomValue);

        // Maximum and minimum
        int maxResult = Math.max(10, 20);
        int minResult = Math.min(5, 15);
        System.out.println("Maximum of 10 and 20: " + maxResult);
        System.out.println("Minimum of 5 and 15: " + minResult);
    }
}
