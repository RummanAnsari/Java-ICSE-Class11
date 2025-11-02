# ⚙️ Example 020 – DivideException2: Exception Handling with try-catch-finally
**Topic:** Demonstrating handling of division by zero using `try`, `catch`, and `finally` in Java.

---

## 🧩 Problem  
Write a Java program that performs division and **handles division by zero** using the `try-catch-finally` block.  
The program should demonstrate how exceptions can be caught and handled gracefully.

---

## 💡 Objective  
To understand how to use the `try-catch-finally` structure to handle **runtime arithmetic exceptions** in Java.

---

## 🧱 Basic Concept  
- **`try`** contains the code that may throw an exception.  
- **`catch`** handles the exception and prevents program termination.  
- **`finally`** always executes (for cleanup or messages), whether or not an exception occurs.

---

## 💻 Example Code  
```java
package Example020DivdeException2;

public class DivdeException2 {
    public static void main(String[] args) {
        int a = 10, b = 0, c;

        try {
            // 🔢 Attempting risky division
            System.out.println("Attempting division...");
            c = a / b; // Division by zero
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            // ⚠️ Catching the ArithmeticException
            System.out.println("❌ Exception caught: " + e);
        }
        finally {
            // ✅ Executes no matter what happens above
            System.out.println("✔️ Finally block executed.");
        }

        System.out.println("Program continues after handling exception.");
    }
}
```

---

## 🧾 Explanation  
- The division `a / b` causes an **ArithmeticException** when `b` is zero.  
- The exception is caught by the `catch` block.  
- The `finally` block executes regardless of whether an exception occurred.  
- Program continues normally after handling the exception.

---

## ✅ Output  

If `b = 0`:
```
Attempting division...
❌ Exception caught: java.lang.ArithmeticException: / by zero
✔️ Finally block executed.
Program continues after handling exception.
```

If `b != 0` (e.g., `b = 2`):
```
Attempting division...
Result: 5
✔️ Finally block executed.
Program continues after handling exception.
```

---

## 🧠 Key Takeaways  
- Always use **try-catch** when performing risky operations like division or file handling.  
- The **finally** block is useful for cleanup operations or confirmation messages.  
- Exception handling improves **program stability** and **readability**.
