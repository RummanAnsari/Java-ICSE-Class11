# InputMismatchExceptionDemo.java

## What You Learn from This Program

This program teaches you how to use **exception handling in Java** to
prevent your program from crashing when the user enters invalid input.

### Key Learnings:

-   **InputMismatchException** occurs when the user enters a value that
    does not match the expected data type.
-   Using **try-catch** allows the program to continue running even
    after wrong input.
-   `input.nextLine()` clears the invalid input from the buffer.
-   The loop continues until a valid integer is entered.

------------------------------------------------------------------------

## Program Code

``` java
import java.util.*;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                // Display the result
                System.out.println(
                    "The number entered is " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                    "Incorrect input: an integer is required)");
                input.nextLine(); // Discard input
            }
        } while (continueInput);
    }
}
```
