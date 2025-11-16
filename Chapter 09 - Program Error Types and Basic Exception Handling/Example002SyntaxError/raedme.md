# ✅ Syntax Error Example 2 – Corrected Version  
**Topic:** Extra Parenthesis in `if` Expression  

---

## 🧩 Program: Corrected Version of Syntax Error Example 2
```java
package Example2SyntaxError;

public class SyntaxErrorExample2Solution {
    public static void main(String[] args) {
        int I = 10;

        if (I > 5) {  // Corrected expression
            System.out.println("I is greater than 5");
        }
    }
}
```

---

## 💬 Explanation
In the earlier incorrect version:
```java
if (I > ))) {
```
The expression had **extra closing parentheses**, which made it **syntactically invalid**.  
Java requires every opening parenthesis `(` to have a matching closing parenthesis `)`.

Because of the imbalance, the compiler cannot interpret where the condition ends, causing an error like:
```
error: ')' expected
```

After correcting the expression to `if (I > 5)`, the code compiles and runs successfully.

---

## ✅ Output
```
I is greater than 5
```

---

## 🧠 Key Takeaway
- Each opening `(` must have a matching closing `)`.  
- Parenthesis mismatch is a **common beginner syntax error**.  
- Always check conditions carefully before running your program.
