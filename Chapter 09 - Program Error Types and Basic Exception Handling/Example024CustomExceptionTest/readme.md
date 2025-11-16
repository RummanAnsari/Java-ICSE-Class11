# ⚙️ Example 024 – Custom Exception Test  
**Topic:** Demonstrating how to throw and handle a user-defined exception (`NegativeAgeException`) in Java.

---

## 🧩 Problem  
Write a Java program that demonstrates how to use the **throw** keyword to raise a user-defined exception (`NegativeAgeException`) when a negative age is entered.

---

## 💡 Objective  
To understand how to create and throw **custom exceptions** using the `throw` statement and handle them using `try-catch` blocks.

---

## 💻 Example Code  
```java
package Example024CustomExceptionTest;

import java.util.Scanner;

// Custom exception class
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            // Check if the entered age is negative
            if (age < 0) {
                // Throw user-defined exception
                throw new NegativeAgeException("Age cannot be negative!");
            } else {
                System.out.println("Your age is: " + age);
            }
        } 
        catch (NegativeAgeException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("✅ Program execution completed.");
            sc.close();
        }
    }
}
```

---

## 🧾 Explanation  
- A **user-defined exception** `NegativeAgeException` is created by extending the `Exception` class.  
- The `throw` keyword is used to **manually trigger** this exception if the input age is negative.  
- The `catch` block handles the exception gracefully and displays a custom message.  
- The `finally` block executes irrespective of whether an exception occurred or not.

---

## ✅ Sample Output  

If age entered is `21`:  
```
Enter your age: 21
Your age is: 21
✅ Program execution completed.
```

If age entered is `-5`:  
```
Enter your age: -5
❌ Exception caught: Age cannot be negative!
✅ Program execution completed.
```
