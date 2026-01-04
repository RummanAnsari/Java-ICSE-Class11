import java.util.*;
public class ScannerLoop {
    public static void main(String[] args) {
        double n;
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number. Non-number will stop input.");
        while (in.hasNextDouble()) {
            n = in.nextDouble();
            sum = sum + n;
        }
        in.close();
        System.out.println("The total is " + sum);
    }
}