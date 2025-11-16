package Example013LogicalErrorExample1;

public class Example013LogicalErrorExample1Solution {
    public static int sum(int a, int b) {
        //  return a - b;  // ❌ Wrong logic: subtraction instead of addition
        return a + b;  // ✅ Correct logic: addition operator used
    }

    public static void main(String[] args) {
        int result = sum(10, 5);
        System.out.println("Sum of 10 and 5 is: " + result);
    }
}