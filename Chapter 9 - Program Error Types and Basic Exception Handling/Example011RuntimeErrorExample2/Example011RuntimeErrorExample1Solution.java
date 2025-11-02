package Example011RuntimeErrorExample2;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example011RuntimeErrorExample1Solution {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("names.txt")) {  // ✅ Auto-closes file
            System.out.println("File opened successfully!");
            // You can read from the file here if needed
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: The file 'names.txt' was not found.");
        } 
        catch (IOException e) {
            System.out.println("Error while closing the file.");
        }
    }
}
