public class Practical34 {
    public static void main(String[] args) {
        // Initialize a sample string
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert to lowercase and uppercase
        String lowercase = str.toLowerCase();
        String uppercase = str.toUpperCase();
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);

        // Substring
        String substring = str.substring(7); // "World!"
        System.out.println("Substring from index 7: " + substring);

        // Concatenation
        String anotherStr = " Welcome to Java!";
        String concatenated = str.concat(anotherStr); // Concatenate two strings
        System.out.println("Concatenated string: " + concatenated);

        // Replace
        String replaced = str.replace('o', '0'); // Replace 'o' with '0'
        System.out.println("String after replacement: " + replaced);

        // Check if the string contains a substring
        boolean contains = str.contains("Hello"); // Check if "Hello" is in the string
        System.out.println("Contains 'Hello': " + contains);

        // Find the index of a character or substring
        int indexOfComma = str.indexOf(","); // Find the index of ','
        System.out.println("Index of ',': " + indexOfComma);

        // Split the string into an array of substrings
        String[] parts = str.split(", "); // Split by ", "
        System.out.println("Split into parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Trim leading and trailing spaces
        String stringWithSpaces = "   Trim me!   ";
        String trimmed = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");
    }
}
