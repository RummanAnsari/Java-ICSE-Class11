# ⚙️ Example 021 – Demonstrating the `finally` Clause Execution  
**Topic:** Illustrating that the `finally` block always executes, even if the `try` block exits prematurely (e.g., using `break`, `return`, or exception).

---

## 🧩 Problem  
Create a Java program that demonstrates the **execution of the `finally` block**, even when the program **exits from the `try` block** using a `break` statement.  

This example proves that the `finally` block always executes before the control leaves the method or loop.

---

## 💡 Objective  
To understand the **importance and guaranteed execution** of the `finally` clause in Java’s exception handling mechanism.

---

## 🧱 Concept  
- The `finally` block executes **regardless of what happens** in the `try` block — even if it returns, breaks, or throws an exception.  
- It is primarily used to **release resources** or perform **cleanup operations**.

---

## 💻 Example Code  
```java
package Example021TryCatchBreak;

public class Example021TryCatchBreak {
    public static void main(String[] args) {
        System.out.println("Program started...");

        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("\nIteration: " + i);

                if (i == 2) {
                    System.out.println("Breaking out of try block...");
                    break; // Exit from try block
                }
                System.out.println("Inside try block...");
            } 
            catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            } 
            finally {
                System.out.println("✅ Finally block executed for iteration " + i);
            }
        }

        System.out.println("\nProgram ended normally.");
    }
}
```

---

## 🧾 Explanation  
- The program runs a loop three times.  
- On the second iteration, it **breaks** out of the `try` block before completion.  
- Despite this, the **`finally` block still executes**, confirming that it runs under all circumstances.  

---

## ✅ Output  
```
Program started...

Iteration: 1
Inside try block...
✅ Finally block executed for iteration 1

Iteration: 2
Breaking out of try block...
✅ Finally block executed for iteration 2

Program ended normally.
```

---

## 🧠 Key Takeaways  
- The `finally` block **always executes**, even if a `break`, `continue`, or `return` statement is used inside the `try` block.  
- Ideal for **cleanup activities**, such as closing files, releasing locks, or disconnecting from a database.  
- Demonstrates **predictable program behavior** even during unexpected exits.
