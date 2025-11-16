# ⚙️ Example026ThrowCatchDemo

**Topic:** Demonstrating `throw` and `catch` mechanism in Java.

---

## 🧩 Problem  
Write a Java program that demonstrates how to **manually throw and catch an exception** using the `throw` keyword.  
The program should check if a variable `M` is greater than `100`, and if true, throw an exception.

---

## 💡 Objective  
To understand how to use `throw` to generate custom exceptions and handle them gracefully with a `try-catch` block.

---

## 💻 Example Code  
```java
package Example026ThrowCatchDemo;

public class Example026ThrowCatchDemo {
    public static void main(String[] args) {
        int M = 150; // Test value greater than 100

        try {
            // ⚠️ Check condition and manually throw an exception
            if (M > 100) {
                throw new Exception("Value of M exceeds the limit of 100!");
            }
            System.out.println("Value of M is within the acceptable range.");
        } 
        catch (Exception e) {
            // 🎯 Handle the thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            // 🧹 This block executes regardless of exception
            System.out.println("Execution completed. 'finally' block executed.");
        }
    }
}
```

---

## 🧾 Explanation  
- The `throw` statement is used to **manually generate an exception**.  
- When `M > 100`, a new `Exception` object is created and thrown.  
- The `catch` block catches it and prints an appropriate message.  
- The `finally` block executes in all cases to ensure cleanup or final statements.

---

## 🧠 Key Takeaways  
- Use `throw` when you want to **explicitly trigger** an exception.  
- Always handle thrown exceptions with a `try-catch` structure.  
- The `finally` block runs **even if an exception is thrown**.  

---

## ✅ Output  
If `M = 150`:
```
Exception caught: Value of M exceeds the limit of 100!
Execution completed. 'finally' block executed.
```

If `M = 80`:
```
Value of M is within the acceptable range.
Execution completed. 'finally' block executed.
```
