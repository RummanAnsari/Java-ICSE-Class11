package Example003SyntaxError;

public class SyntaxErrorExample3 {
    public static void main(String[] args) {
        int max;
        // max = ;  // Missing right-hand side value

        // Solution
        max = 100;  // Assigned a value to max
        System.out.println("Maximum value is: " + max);
    }
}
