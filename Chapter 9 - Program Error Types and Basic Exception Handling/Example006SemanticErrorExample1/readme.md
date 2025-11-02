# ⚠️ Semantic Error Example 1 – Use of a Non-Initialized Variable  
**Topic:** Demonstrating the Use of a Non-Initialized Variable (`int i; i++;`)

---

## 🧩 Problem
Write a Java program that increments an integer variable.  
However, if the variable is declared but **not initialized before use**, the compiler should report a **semantic error**.

---

## ❌ Incorrect Code
```java
class Example6SemanticErrorExample1 {
    public static void main(String[] args) {
        int i;   // Declared but not initialized
        i++;     // Using variable before assigning a value
        System.out.println("Value of i: " + i);
    }
}
```

---

## 💬 Error Explanation
In Java, **local variables must be initialized before they are used**.  
Although the syntax of the code is correct, the variable `i` has not been given any value before the increment operation `i++`.

This causes a **compile-time semantic error** similar to:
```
error: variable i might not have been initialized
```

Even though the code structure is valid, the **meaning (semantics)** is wrong because the variable doesn’t hold a defined value in memory when used.

---

## ✅ Correct Code
```java
package Example6SemanticErrorExample1;

public class Example6SemanticErrorExample1Solution {
    public static void main(String[] args) {
        int i = 0;   // Variable initialized before use
        i++;         // Incrementing the initialized variable
        System.out.println("Value of i: " + i);
    }
}
```

---

## 🧾 Explanation of Solution
In the corrected version:
- The variable `i` is **initialized with a value (0)** before it’s incremented.
- This ensures the compiler knows the starting value of `i`.
- The code now compiles and executes successfully.

---

## ✅ Output
```
Value of i: 1
```

---

## 🧠 Key Takeaway
- **Local variables must be initialized before use** in Java.  
- Forgetting to assign a value before using the variable leads to a **semantic error**.  
- Always check that every variable has a meaningful initial value before performing operations on it.
