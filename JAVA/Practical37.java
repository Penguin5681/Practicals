import java.io.*;

public class Practical37 {
    public static void main(String[] args) {
        // File class
        File file = new File("sample.txt");

        // FileWriter and BufferedWriter for writing to a file
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine(); // Write a newline character
            bufferedWriter.write("This is a Java I/O example.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // FileReader and BufferedReader for reading from a file
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

        // FileInputStream and FileOutputStream for binary file operations
        byte[] data = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100 };
        try (FileOutputStream outputStream = new FileOutputStream("binary_data.txt")) {
            outputStream.write(data);
        } catch (IOException e) {
            System.err.println("Error writing binary data to the file: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream("binary_data.txt")) {
            System.out.println("Binary data read from the file:");
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.err.println("Error reading binary data from the file: " + e.getMessage());
        }
    }
}
