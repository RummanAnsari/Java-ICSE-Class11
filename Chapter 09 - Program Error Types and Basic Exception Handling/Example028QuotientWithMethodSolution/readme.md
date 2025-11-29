# QuotientWithMethod -- Easy Explanation for Class 10 Students

This program teaches how to **divide two numbers safely** in Java and
how to handle errors using **exception handling**.

------------------------------------------------------------------------

## 📘 What This Program Does

-   It asks the user to enter **two integers**.
-   It divides the first number by the second.
-   If the second number is **0**, the program does not crash ---
    instead, it shows a clear error message.
-   This is done using **exceptions** (a safe way to handle mistakes in
    programming).

------------------------------------------------------------------------

## 🧠 Important Concepts (Explained Simply)

### ✅ 1. What is a Method?

A method is like a small machine inside a program.\
You give it some input, it does some work, and gives you output.

Here, `quotient()` is a method that divides two numbers.

------------------------------------------------------------------------

### ✅ 2. Why Can't We Divide by Zero?

In mathematics and computers, dividing by zero is **not allowed**.\
If you try to do it, the computer shows an **error**.

So the program checks:

``` java
if (number2 == 0) {
    throw new ArithmeticException("Divisor cannot be zero");
}
```

Instead of crashing, it sends a friendly message:

    Error: Divisor cannot be zero

------------------------------------------------------------------------

### ✅ 3. What is try--catch?

-   **try** = Try to run some code.
-   **catch** = If something goes wrong, handle the error nicely.

This prevents the program from stopping suddenly.

------------------------------------------------------------------------

## 🖥 Program Code

``` java
package Example028QuotientWithMethodSolution;

import java.util.Scanner;

public class QuotientWithMethod {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
```

------------------------------------------------------------------------

## 📤 Output Examples

### ✔ When input is valid:

    Enter two integers: 10 2
    10 / 2 is 5

### ❌ When trying to divide by 0:

    Enter two integers: 10 0
    Error: Divisor cannot be zero

The program **keeps running without crashing**.

------------------------------------------------------------------------

## 📝 Summary for Class 10 Students

  Concept            Meaning
  ------------------ --------------------------------------
  Method             A block of code that performs a task
  Division by Zero   Not allowed in math or in computers
  Exception          An error that can be handled safely
  try--catch         Prevents program from crashing

------------------------------------------------------------------------

## 🎉 Final Understanding

This program teaches you:\
✔ How to divide numbers in Java\
✔ How to prevent the program from crashing\
✔ How to show user-friendly error messages\
✔ How to use exception handling

This is a very important skill for writing safe and smart programs!
