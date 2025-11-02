# 🧩 Logical Error Example 1 – Incorrect Computation in Method

**Topic:** Demonstrating a **Logical Error** where the logic of the program is wrong, even though it compiles and runs successfully.

---

## 🚫 Problem
Write a Java method `sum(int a, int b)` that should return the sum of two integers.  
However, due to a **logical mistake**, the method uses the **subtraction operator** (`-`) instead of the **addition operator** (`+`).

---

## ❌ Incorrect Code
```java
package Example013LogicalErrorExample1;

public class Example013LogicalErrorExample1 {
    public static int sum(int a, int b) {
        return a - b;  // ❌ Wrong logic: subtraction instead of addition
    }

    public static void main(String[] args) {
        int result = sum(10, 5);
        System.out.println("Sum of 10 and 5 is: " + result);
    }
}
```

---

## 💬 Error Explanation
This program will **compile and run successfully**, but it will produce an **incorrect output**.

### Output:
```
Sum of 10 and 5 is: 5
```

The correct sum should be **15**, but because of the wrong operator, the logic fails.  
This is called a **Logical Error** — the program executes without crashing, but the result is not what was intended.

---

## ✅ Correct Code
```java
package Example013LogicalErrorExample1;

public class Example013LogicalErrorExample1Solution {
    public static int sum(int a, int b) {
        return a + b;  // ✅ Correct logic: addition operator used
    }

    public static void main(String[] args) {
        int result = sum(10, 5);
        System.out.println("Sum of 10 and 5 is: " + result);
    }
}
```

---

## 🧾 Explanation of Solution
- The error occurred due to the **wrong operator** being used.
- A **logical error** doesn’t stop the program — it just gives **incorrect results**.
- Correcting the operator fixes the logic and produces the intended output.

---

## ✅ Correct Output
```
Sum of 10 and 5 is: 15
```

---

## 🧠 Key Takeaway
- **Logical errors** occur when the **logic or formula** in a program is wrong.  
- They are the hardest to detect because the compiler does not warn about them.  
- Testing and debugging are essential to catch logical errors in code.
