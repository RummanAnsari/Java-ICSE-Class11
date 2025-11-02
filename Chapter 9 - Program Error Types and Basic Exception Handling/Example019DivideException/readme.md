# ⚙️ Example 019 – DivideException (No Error Handling)
**Topic:** Demonstrating how Java terminates program execution when an exception occurs and no handler is provided.  

---

## 🧩 Problem  
Write a Java program that performs a division operation but does **not** include any exception handling mechanism.  
This program will show what happens when a **runtime error** (division by zero) occurs — Java will throw an **ArithmeticException** and terminate the program.

---

## 💡 Objective  
To understand what happens when a **runtime exception** occurs and **no `try-catch` block** is present.

---

## 🧱 Basic Concept  
- Division by zero in Java causes an `ArithmeticException`.  
- If no exception handler (`try-catch`) is provided, the **JVM terminates the program**.  
- This helps us understand **why exception handling is important**.

---

## 💻 Example Code  
```java
package Example019DivideException;

public class DivideException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // ❌ Division by zero will cause an exception
        int result = a / b;

        System.out.println("Result = " + result); // This line will never execute
    }
}
```

---

## 🧾 Explanation  
- The variable `b` is assigned **0**.  
- The statement `a / b` causes a **runtime ArithmeticException** because division by zero is undefined.  
- Since there is **no `try-catch` block**, Java **terminates** the program and prints an error message.

---

## ⚠️ Output (when executed)
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Example019DivideException.DivideException.main(DivideException.java:7)
```

---

## 🧠 Key Takeaways  
- If exceptions are **not handled**, the JVM will **terminate** the program abruptly.  
- This highlights the importance of **exception handling** for building robust applications.  
- The next step is to **add a `try-catch` block** to gracefully handle such errors.
