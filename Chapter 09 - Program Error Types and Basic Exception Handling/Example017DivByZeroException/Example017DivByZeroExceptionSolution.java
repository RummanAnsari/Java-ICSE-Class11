package Example017DivByZeroException;

public class Example017DivByZeroExceptionSolution {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;  // ⚠️ Risky operation
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Division by zero is not allowed!");
        }

        System.out.println("✅ Program continues after handling the exception.");
    }
}