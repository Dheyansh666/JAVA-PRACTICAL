package Part6;
import java.io.*;

public class P31 {

    public static void main(String[] args) {
        // Using BufferedReader to read input from the console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            System.out.println("Enter text to save to a file (type 'exit' to quit):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                // Writing to file using BufferedWriter
                writer.write(line);
                writer.newLine(); // Add a new line
            }

            System.out.println("Input saved to 'output.txt'.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        // Demonstrating byte stream with FileInputStream and FileOutputStream
        try (FileInputStream fis = new FileInputStream("output.txt");
             FileOutputStream fos = new FileOutputStream("copy_output.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Reading from byte stream and writing to another byte stream
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied to 'copy_output.txt'.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}


