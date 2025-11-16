package Example010RuntimeErrorExample1;

public  class Example10RuntimeErrorExample1Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0) {
            int c = a / b;
            System.out.println("Result: " + c);
        } else {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}

// Code added to handle runtime error (division by zero)