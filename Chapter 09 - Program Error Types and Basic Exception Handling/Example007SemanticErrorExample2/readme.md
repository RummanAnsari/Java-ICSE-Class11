# ⚠️ Semantic Error Example 2 – Type Incompatibility  
**Topic:** Demonstrating Type Incompatibility (`int a = "Hello";`)

---

## 🧩 Problem
Write a Java program that tries to assign a **string value** to an **integer variable**.  
This will cause a **semantic (compile-time)** error because Java does not allow **incompatible data type assignments**.

---

## ❌ Incorrect Code
```java
class Example7SemanticErrorExample2 {
    public static void main(String[] args) {
        int a = "Hello";   // ❌ Incompatible data types
        System.out.println(a);
    }
}
```

---

## 💬 Error Explanation
In Java, **strong type checking** ensures that variables can only store data of the declared type.  
Here, a **String value** (`"Hello"`) is being assigned to an **int variable**, which is not logically valid.  
Even though the syntax is correct, the **meaning (semantics)** is wrong.

Typical compiler message:
```
error: incompatible types: String cannot be converted to int
```

This means that Java cannot understand how to convert a text value into a numeric one.

---

## ✅ Correct Code
```java
package Example7SemanticErrorExample2;

public class Example7SemanticErrorExample2Solution {
    public static void main(String[] args) {
        int a = 10;                 // ✅ Correct numeric assignment
        System.out.println(a);

        String b = "Hello";         // ✅ Correct text assignment
        System.out.println(b);
    }
}
```

---

## 🧾 Explanation of Solution
- Java variables are **strongly typed** — you cannot mix incompatible data types.
- `int` variables can store only numeric values.
- `String` variables are used for text.
- Assigning `"Hello"` to an integer causes a **semantic error** because it violates type rules.

---

## ✅ Output
```
10
Hello
```

---

## 🧠 Key Takeaway
Semantic errors occur when the program’s logic or meaning is invalid,  
even though the syntax is correct.  
✅ Always ensure that the **data type of the variable** matches the **type of value** being assigned.
