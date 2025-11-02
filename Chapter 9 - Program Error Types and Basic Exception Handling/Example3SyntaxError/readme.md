# ✅ Syntax Error Example 3 – Corrected Version  
**Topic:** Missing Right-Hand Side in Assignment (`max = ;`)  

---

## 🧩 Problem
Write a Java program to assign a value to a variable and display it.  
However, if you forget to provide the **right-hand side value** during assignment, the compiler should show a **syntax error**.

---

## ❌ Incorrect Code
```java
class SyntaxErrorExample3 {
    public static void main(String[] args) {
        int max;
        max = ;  // Missing right-hand side value
        System.out.println("Maximum value is: " + max);
    }
}
```

---

## 💬 Error Explanation
In Java, the **assignment operator (`=`)** must always have a **valid value or expression** on its right-hand side.  
The statement `max = ;` is incomplete — the compiler expects a value but finds a semicolon instead.  

This causes a **compile-time syntax error** such as:
```
error: not a statement
error: ';' expected
```

---

## ✅ Correct Code
```java
package Example3SyntaxError;

public class SyntaxErrorExample3Solution {
    public static void main(String[] args) {
        int max;
        max = 100;  // Right-hand side value provided
        System.out.println("Maximum value is: " + max);
    }
}
```

---

## 🧾 Explanation of Solution
After assigning a valid value (`100`) to the variable `max`,  
the program now compiles and executes successfully, printing the expected output.

---

## ✅ Output
```
Maximum value is: 100
```

---

## 🧠 Key Takeaway
- Each **assignment statement** must have both a variable and a value.  
- Missing the right-hand side value results in a **compile-time syntax error**.  
- Always ensure your statements are **complete and meaningful** before compilation.
