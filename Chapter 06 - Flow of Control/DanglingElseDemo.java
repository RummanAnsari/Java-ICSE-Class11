// Program to demonstrate the Dangling-Else problem
class DanglingElseDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // System.out.println("Without using braces (default matching):");
        // if (a > 0)
        //     if (b  0)
        //         System.out.println("Both a and b are positive");
        //     else
        //         System.out.println("a is not positive (belongs to inner if)");

         // Adding a separator line
        System.out.println("\nUsing braces to remove ambiguity:");
        if (a < 0) {
            if (b > 0)
                System.out.println("Both a and b are positive");
        } else {
            System.out.println("a is not positive (belongs to outer if)");
        }
    }
}
