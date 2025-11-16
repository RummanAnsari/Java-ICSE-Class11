# ✅ Syntax Error Example 1 – Corrected Version  
**Topic:** String Not Enclosed Properly in Double Quotes  

---

## 🧩 Program: Corrected Version of Syntax Error Example 1
```java
package Example1SyntaxError;

class SyntaxErrorExample1Solution {
    public static void main(String[] args) {
        String str = "This is a long string"; // Corrected version
        System.out.println(str);
    }
}
```

---

## 💬 Explanation
In the earlier incorrect version:
```java
String str = "This is a long string';
```
The string literal was **not properly enclosed in double quotes**.  
Java requires all string values to be enclosed in **double quotes (" ")**.  
Using a single quote `'` or leaving a quote unmatched will cause a **compile-time syntax error** like:
```
error: unclosed string literal
```

---

## ✅ Output
```
This is a long string
```

---

## 🧠 Key Takeaway
- Always use **double quotes (" ")** to define string literals in Java.  
- Single quotes (`' '`) are only used for **character literals** (e.g., `char ch = 'A';`).  
- Syntax errors prevent your program from compiling successfully — they must be corrected before execution.
