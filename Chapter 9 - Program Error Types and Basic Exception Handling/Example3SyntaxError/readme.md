# ✅ Syntax Error Example 3 – Corrected Version  
**Topic:** Missing Right-Hand Side in Assignment (`max = ;`)  

---

## 🧩 Program: Corrected Version of Syntax Error Example 3
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

## 💬 Explanation
In the earlier incorrect version:
```java
max = ;
```
The **assignment operator (`=`)** had no value or expression on the right-hand side.  
In Java, every assignment statement must have **a valid value or expression** after `=`.  
The compiler throws a **syntax error** such as:
```
error: not a statement
error: ';' expected
```

After adding a valid value (`max = 100;`), the program compiles and runs correctly.

---

## ✅ Output
```
Maximum value is: 100
```

---

## 🧠 Key Takeaway
- Every assignment statement must include both sides: **variable = value**.  
- Omitting the right-hand side value results in a **compile-time syntax error**.  
- Always verify your assignment statements before compiling.
