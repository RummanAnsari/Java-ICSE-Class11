package Example016TracingStatements;

public class Example016TracingStatementsSolution {
    public static void chk(int n) {
        int i = 1, sum = 0;
        System.out.println("Tracing started...");
        while (i <= n) {
            System.out.println("Before iteration: i = " + i + ", sum = " + sum);
            sum = sum + i;
            System.out.println("After adding: i = " + i + ", sum = " + sum);
            i++;
        }
        System.out.println("Tracing ended. Final Sum = " + sum);
    }

    public static void main(String[] args) {
        chk(5);
    }
}