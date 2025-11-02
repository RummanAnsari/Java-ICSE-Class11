# 💥 Run-Time Error Example 1 – Division by Zero  
**Topic:** Demonstrating Division by Zero in Java

---

## 🧩 Problem
Write a Java program that divides one number by another.  
If the **denominator is zero**, the program will cause a **Run-Time Error** known as  
`java.lang.ArithmeticException: / by zero`.

Unlike compile-time errors, **run-time errors** occur **while the program is executing**.

---

## ❌ Incorrect Code
```java
class Example10RuntimeErrorExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;              // ❌ Division by zero
        int c = a / b;          // Causes java.lang.ArithmeticException
        System.out.println("Result: " + c);
    }
}
```

---

## 💬 Error Explanation
- The division operator `/` cannot be used when the **denominator (b)** is zero.
- During execution, when the JVM reaches `a / b`, it detects this invalid operation.
- The program crashes and displays the following error:

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Example10RuntimeErrorExample1.main(Example10RuntimeErrorExample1.java:5)
```

This is a **Run-Time Error** because the program compiles successfully but fails when executed.

---

## ✅ Correct Code
```java
package Example10RuntimeErrorExample1;

public class Example10RuntimeErrorExample1Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0) {
            int c = a / b;
            System.out.println("Result: " + c);
        } else {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}
```

---

## 🧾 Explanation of Solution
- Before performing division, always **check if the denominator is zero**.
- If `b == 0`, print an error message instead of performing the operation.
- This prevents the **ArithmeticException** and allows the program to continue running safely.

---

## ✅ Output
```
Error: Division by zero is not allowed!
```

If `b` is non-zero, for example `b = 2`, the output would be:
```
Result: 5
```

---

## 🧠 Key Takeaway
- **Compile-time errors** prevent the program from running.  
- **Run-time errors** occur during execution and can crash the program.  
- Always **validate input values** before performing operations like division to avoid unexpected crashes.
