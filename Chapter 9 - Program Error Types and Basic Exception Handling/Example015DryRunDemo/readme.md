# 🧮 Code for Desk-Checking and Dry Run

**Topic:** Demonstrating how to **manually track variable values** during program execution using **desk checking** (also called **dry run**).

---

## 🧩 Problem
Write a Java method `void test()` that uses a `for` loop.  
You must **track how variables change at each iteration** to understand program flow.

This process is called a **dry run** — mentally executing the code or using a table to trace variable values without actually running the program.

---

## 🧠 Concept
- **Desk Checking / Dry Run** is a manual method to verify whether the logic of a program works correctly.
- You simulate code execution line-by-line on paper or in a table.
- It helps identify **logical errors** or **unexpected behavior** before compiling and running the program.

---

## 🧾 Example Code
```java
package Example015DryRunDemo;

public class Example015DryRunDemo {
    public static void test() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println("Iteration " + i + ": sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }

    public static void main(String[] args) {
        test();
    }
}
```

---

## 🧩 Desk-Checking Table

| Iteration | i | sum (Before Addition) | Operation     | sum (After Addition) |
|------------|---|------------------------|----------------|-----------------------|
| 1          | 1 | 0                      | sum = 0 + 1    | 1                     |
| 2          | 2 | 1                      | sum = 1 + 2    | 3                     |
| 3          | 3 | 3                      | sum = 3 + 3    | 6                     |
| 4          | 4 | 6                      | sum = 6 + 4    | 10                    |
| 5          | 5 | 10                     | sum = 10 + 5   | 15                    |

---

## 🧾 Explanation of Dry Run
- The loop runs **5 times** (`i = 1` to `5`).
- In each iteration, `i` is added to `sum`.
- You can **track** how `sum` changes after each iteration.
- This method is useful to **validate loop logic** or **detect logic errors**.

---

## ✅ Output
```
Iteration 1: sum = 1
Iteration 2: sum = 3
Iteration 3: sum = 6
Iteration 4: sum = 10
Iteration 5: sum = 15
Final Sum: 15
```

---

## 🧠 Key Takeaway
- **Dry run** helps debug logic manually before executing code.  
- It enhances understanding of how variables change during loop iterations.  
- Ideal for learning loops, conditions, and arithmetic logic in programming.
