# 🧩 Example016TracingStatements – Code for Inserting Tracing Statements  
**Topic:** Demonstrating how tracing statements (`System.out.println`) help in debugging and understanding code flow.

---

## 🧩 Problem  
Write a Java program containing a method `void chk(int n)` that processes a number.  
You must show **two versions**:
1. Original code (without tracing).
2. Modified code with tracing (`System.out.println`) inserted to track execution steps.

---

## ❌ Original Code
```java
package Example016TracingStatements;

public class Example016TracingStatementsOriginal {
    public static void chk(int n) {
        int i = 1, sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        chk(5);
    }
}
```

### 🧾 Explanation  
This code computes the sum of numbers from 1 to `n`.  
However, if the output is incorrect or unexpected, it can be **hard to identify where the logic failed**.

---

## ✅ Correct (Traced) Code
```java
package Example016TracingStatements;

public class Example016TracingStatementsSolution {
    public static void chk(int n) {
        int i = 1, sum = 0;
        System.out.println("Tracing started...");
        while (i <= n) {
            System.out.println("Before iteration: i = " + i + ", sum = " + sum);
            sum = sum + i;
            System.out.println("After adding: i = " + i + ", sum = " + sum);
            i++;
        }
        System.out.println("Tracing ended. Final Sum = " + sum);
    }

    public static void main(String[] args) {
        chk(5);
    }
}
```

---

## 🧾 Explanation of Solution  
- **Tracing statements** (`System.out.println`) are inserted inside the loop to track values of variables step-by-step.  
- Helps identify **logical errors** or incorrect variable updates.  
- After debugging, these tracing lines can be removed or commented out.

---

## 🧠 Key Takeaways  
- Tracing statements are a **manual debugging method**.  
- They show **how data changes** during program execution.  
- Useful for verifying **loop logic** and **conditional checks**.  
- Once the program runs correctly, you can remove or disable them for cleaner output.

---

## ✅ Sample Output
```
Tracing started...
Before iteration: i = 1, sum = 0
After adding: i = 1, sum = 1
Before iteration: i = 2, sum = 1
After adding: i = 2, sum = 3
Before iteration: i = 3, sum = 3
After adding: i = 3, sum = 6
Before iteration: i = 4, sum = 6
After adding: i = 4, sum = 10
Before iteration: i = 5, sum = 10
After adding: i = 5, sum = 15
Tracing ended. Final Sum = 15
```

---

## 🧠 Key Concept  
> **Tracing** is the process of following a program’s logic step-by-step to understand its behavior and detect errors.
