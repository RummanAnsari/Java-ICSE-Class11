package Example015DryRunDemo;

public class Example015DryRunDemo {
    public static void test() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println("Iteration " + i + ": sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }

    public static void main(String[] args) {
        test();
    }
}