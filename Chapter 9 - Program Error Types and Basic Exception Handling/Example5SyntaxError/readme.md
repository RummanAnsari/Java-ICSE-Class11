# ⚠️ Syantax Error Example 5 – Missing Return Value in a Function  
**Topic:** Demonstrating a Missing Return Value in a Function (`int max(int i, int j) { return; }`)

---

## 🧩 Problem
Write a Java program to find the maximum of two numbers using a function that returns an integer value.  
However, if the `return` statement is written **without returning a value**, the compiler should report a **semantic error**.

---

## ❌ Incorrect Code
```java
class SemanticErrorExample5 {
    static int max(int i, int j) {
        if (i > j)
            return;  // Missing return value
        else
            return;  // Missing return value
    }

    public static void main(String[] args) {
        int result = max(10, 5);
        System.out.println("Maximum value is: " + result);
    }
}
```

---

## 💬 Error Explanation
In Java, when a method is declared with a **return type** (like `int`, `double`, etc.),  
it must return a value of that **exact type** using the `return` statement.

Here, both `return;` statements **do not return any value**, even though the method’s return type is `int`.  
This causes a **compile-time semantic error**, for example:
```
error: missing return value
error: incompatible types: missing return statement
```

---

## ✅ Correct Code
```java
package Example5SemanticError;

public class SemanticErrorExample5Solution {
    static int max(int i, int j) {
        if (i > j)
            return i;  // Returns an integer value
        else
            return j;  // Returns an integer value
    }

    public static void main(String[] args) {
        int result = max(10, 5);
        System.out.println("Maximum value is: " + result);
    }
}
```

---

## 🧾 Explanation of Solution
In the corrected version:
- The function `max()` now **returns an integer value** in both cases (`i` or `j`).  
- This satisfies the function’s declared return type (`int`).  
- The compiler successfully compiles the code, and the program prints the correct maximum value.

---

## ✅ Output
```
Maximum value is: 10
```

---

## 🧠 Key Takeaway
- Every method that declares a **return type** must **return a value** of that type in all code paths.  
- Omitting a return value causes a **semantic error**, even if your syntax is correct.  
- To avoid this, ensure all branches of conditional logic (`if`, `else`) return a value when required.
