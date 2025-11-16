# ⚙️ Example 023 – Programs Illustrating User-Defined Exceptions (NegativeAgeException.java)
**Topic:** Demonstrating how to create a User-Defined Exception in Java by extending the `Exception` class.

---

## 🧩 Problem
Write a program that defines a **custom exception** called `NegativeAgeException`.  
This exception should be thrown when a user tries to enter an **invalid age** (e.g., negative value).

---

## 💡 Objective
To learn how to **create**, **throw**, and **handle** user-defined exceptions in Java.

---

## 💻 Example Code
```java
package Example023UserDefinedException;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class NegativeAgeExceptionDemo {
    public static void main(String[] args) {
        int age = -5; // Invalid age for demonstration

        try {
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative!");
            }
            System.out.println("Age entered: " + age);
        } 
        catch (NegativeAgeException e) {
            System.out.println("❌ Exception Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("✅ Program execution completed.");
        }
    }
}
```

---

## 🧾 Explanation
- A **custom exception class** `NegativeAgeException` is created by extending the `Exception` class.  
- The constructor passes a custom message to the parent `Exception` class.  
- Inside the `main()` method:
  - The program checks if the age is negative.  
  - If true, it **throws** a `NegativeAgeException`.  
  - The exception is **caught** in the `catch` block, and the message is displayed.  
- The `finally` block executes regardless of whether an exception occurs.

---

## ✅ Output (When `age = -5`)
```
❌ Exception Caught: Age cannot be negative!
✅ Program execution completed.
```

---

## 🧠 Key Takeaways
- User-defined exceptions are useful for handling **application-specific errors**.  
- Always extend from `Exception` (checked exception) or `RuntimeException` (unchecked exception).  
- Throw custom exceptions with meaningful messages for better debugging.

---

### 📂 Files Involved
- `NegativeAgeException.java` – Custom exception class  
- `NegativeAgeExceptionDemo.java` – Main class to demonstrate throwing and handling the exception  

---

✅ **Author:** Rumman Ansari  
📘 **Chapter:** 9 – Program Error Types and Basic Exception Handling  
🏷️ **Concept:** User-Defined Exceptions
