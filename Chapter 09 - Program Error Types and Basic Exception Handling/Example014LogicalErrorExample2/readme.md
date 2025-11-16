# 🧩 Logical Error Example 2 – Non-Terminating While Loop

**Topic:** Demonstrating a **Logical Error** where the loop never terminates due to incorrect logic in the condition.

---

## 🚫 Problem
Write a Java program that demonstrates a **non-terminating loop**.  
The program uses a `while` loop that keeps checking if a `String s` becomes `null`.  
However, because the loop condition never becomes `false`, the loop runs **forever**.

---

## ❌ Incorrect Code
```java
package Example014LogicalErrorExample2;

public class Example014LogicalErrorExample2 {
    public static void main(String[] args) {
        String s = "Hello";

        while (s != null) {  // ❌ Logical error: 's' never becomes null
            System.out.println("Inside loop...");
            s.concat("World"); // This does not modify 's', it creates a new String
        }

        System.out.println("Loop ended.");
    }
}
```

---

## 💬 Error Explanation
This program **compiles and runs successfully**, but it **never terminates**.  
Here’s why:

- The condition `while (s != null)` always remains true.
- The statement `s.concat("World")` does **not** change the original `s` (Strings in Java are immutable).
- Since `s` is never set to `null`, the loop becomes **infinite**.

### Output:
```
Inside loop...
Inside loop...
Inside loop...
Inside loop...
(repeats forever)
```

This is a **logical error**, not a syntax or runtime error.

---

## ✅ Correct Code
```java
package Example014LogicalErrorExample2;

public class Example014LogicalErrorExample2Solution {
    public static void main(String[] args) {
        String s = "Hello";
        int count = 0;

        while (s != null && count < 5) {  // ✅ Added condition to terminate
            System.out.println("Inside loop iteration: " + (count + 1));
            count++;
            if (count == 5) {
                s = null;  // Now 's' becomes null, and loop stops
            }
        }

        System.out.println("Loop ended successfully.");
    }
}
```

---

## 🧾 Explanation of Solution
- Added a **counter (`count`)** to limit loop iterations.
- Explicitly set `s = null` after a certain condition.
- Prevents infinite looping by ensuring a termination condition exists.

---

## ✅ Correct Output
```
Inside loop iteration: 1
Inside loop iteration: 2
Inside loop iteration: 3
Inside loop iteration: 4
Inside loop iteration: 5
Loop ended successfully.
```

---

## 🧠 Key Takeaway
- Logical errors can cause **infinite loops** that hang the program.
- Always ensure that:
  - Loop conditions will eventually become **false**.
  - Variables involved in the condition are **updated** properly.
- Add **safeguards or counters** to prevent unintended infinite loops.
