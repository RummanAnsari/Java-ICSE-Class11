# ⚠️ Semantic Error Example 3 – Unsupported Operand Types in Expressions  
**Topic:** Demonstrating Errors in Expressions where an Operator Does Not Support Arguments of a Certain Type (`int a = 5 - s;` where `s` is a String)

---

## 🧩 Problem
Write a Java program that tries to **subtract a string variable from an integer**.  
This causes a **semantic (compile-time)** error because Java does **not support arithmetic operations** between **numeric** and **non-numeric (string)** types.

---

## ❌ Incorrect Code
```java
class Example8SemanticErrorExample3 {
    public static void main(String[] args) {
        String s = "Hello";
        int a = 5 - s;  // ❌ Invalid: cannot subtract a String from an int
        System.out.println(a);
    }
}
```

---

## 💬 Error Explanation
In Java, **arithmetic operators** such as `+`, `-`, `*`, `/` only work with **numeric operands** (e.g., `int`, `double`, `float`).  
Here, one operand is an integer (`5`) and the other is a string (`s`), which is not valid for subtraction.

The compiler will throw an error such as:
```
error: bad operand types for binary operator '-'
first type: int
second type: String
```

This is a **semantic error** — the syntax is valid, but the operation itself makes no sense logically or by type compatibility.

---

## ✅ Correct Code
```java
package Example8SemanticErrorExample3;

public class Example8SemanticErrorExample3Solution {
    public static void main(String[] args) {
        int num = 5;
        String s = "3";

        // ✅ Convert String to integer before arithmetic operation
        int a = num - Integer.parseInt(s);
        System.out.println("Result after subtraction: " + a);
    }
}
```

---

## 🧾 Explanation of Solution
- Java allows subtraction **only between numeric types**.
- To fix the error, the string `"3"` is converted to an integer using `Integer.parseInt(s)`.
- Now both operands (`num` and parsed integer) are numeric, so subtraction works correctly.

---

## ✅ Output
```
Result after subtraction: 2
```

---

## 🧠 Key Takeaway
- **Semantic errors** occur when an operation is not meaningful or valid for the given data types.  
- Always ensure that operands in expressions are **compatible** with the operator being used.  
- Java’s **strong type system** prevents invalid type operations, helping avoid runtime issues.
