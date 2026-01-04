import java.io.*;
import java.util.*;
public class ScanFileApp {
    public static void main(String arg[]) {
        File file = new File("textOutput.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }
        try {
            while (true) {
                if (scanner.hasNextBoolean()) break;
                scanner.next();
            }
            // Reading and printing boolean, int, long, float, double...
        } catch (InputMismatchException e) {
            System.out.println("Mismatch exception:" + e);
        }
    }
}