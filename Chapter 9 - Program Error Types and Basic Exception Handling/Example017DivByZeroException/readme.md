# ⚙️ Example 017 – Class Demonstrating Exception Occurrence  
**Topic:** Demonstrating how Java throws an `ArithmeticException` when division by zero occurs.

---

## 🧩 Problem  
Write a Java program that performs integer division, but the divisor (`b`) is zero.  
The program should demonstrate how Java terminates execution when an **unchecked exception** occurs at runtime.

---

## ❌ Incorrect Code  
```java
package Example017DivByZeroException;

public class DivByZero {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b; // ❌ Division by zero causes ArithmeticException
        System.out.println("Result: " + result);
    }
}
```

---

## 💬 Error Explanation  
- Division by zero in Java is **not allowed** for integer arithmetic.  
- When Java encounters `a / b` and `b` is `0`, it throws an **`ArithmeticException`** at runtime.  
- This is an **unchecked exception** (a subclass of `RuntimeException`), meaning it is **not caught** by the compiler.

Example output:
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Example017DivByZeroException.DivByZero.main(DivByZero.java:6)
```

---

## ✅ Correct Code (Handled Exception)
```java
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
```

---

## 🧾 Explanation of Solution  
- The **try block** encloses the risky operation (`a / b`).  
- When `b = 0`, Java automatically throws an **ArithmeticException**.  
- The **catch block** handles it gracefully and prevents the program from crashing.  
- The message inside `catch` informs the user about the issue.

---

## 🧠 Key Takeaways  
- **Unchecked exceptions** like `ArithmeticException` occur during execution.  
- They don’t require explicit handling but should be caught to make programs robust.  
- Always validate divisors or use `try-catch` for safer arithmetic operations.

---

## ✅ Output  
If `b = 0`:
```
❌ Error: Division by zero is not allowed!
✅ Program continues after handling the exception.
```

If `b = 2`:
```
Result: 5
✅ Program continues after handling the exception.
```
