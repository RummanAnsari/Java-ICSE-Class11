import java.io.*;
import java.util.*;
public class ScanConsoleApp {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("Input int (e.g. %4d): ", 3501);
            int int_val = scanner.nextInt();
            System.out.println("You entered " + int_val + "\n");
            // Similar blocks for float and double...
        } catch (InputMismatchException e) {
            System.out.println("Mismatch exception:" + e);
        }
    }
}