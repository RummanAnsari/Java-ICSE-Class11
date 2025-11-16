# 💥 Run-Time Error Example 3 – Dereferencing a Null Reference
**Topic:** Demonstrating `NullPointerException` when trying to call a method on a null reference

---

## 🧩 Problem
Write a Java program that tries to **call a method on a null reference** using `String.concat()`.  
If the string variable is initialized to `null`, Java will throw a **Run-Time Error**:
```
java.lang.NullPointerException
```

This error occurs **during execution**, not at compile time.

---

## ❌ Incorrect Code
```java
class Example012RuntimeErrorExample3 {
    public static void main(String[] args) {
        String s = null; // ❌ s is null
        System.out.println(s.concat("a")); // Causes NullPointerException
    }
}
```

---

## 💬 Error Explanation
The error occurs because you are trying to **dereference a null object** — calling a method (`concat`) on a variable that doesn't actually reference a valid `String` object.

Example error message:
```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "s" is null
    at Example012RuntimeErrorExample3.main(Example012RuntimeErrorExample3.java:4)
```

Even though the program compiles without errors, it fails **at run-time**.

---

## ✅ Correct Code
```java
package Example012RuntimeErrorExample3;

public class Example012RuntimeErrorExample3Solution {
    public static void main(String[] args) {
        String s = "Hello"; // ✅ Properly initialized string
        System.out.println(s.concat(" World!")); // Works fine
    }
}
```

---

## 🧾 Explanation of Solution
- The variable `s` must reference a valid `String` object before calling any methods on it.
- When `s` is `null`, there is **no object in memory** to operate on, leading to a **NullPointerException**.
- Always initialize variables before using them to avoid this error.

---

## ✅ Output
```
Hello World!
```

---

## 🧠 Key Takeaway
- A **NullPointerException** occurs when you try to use a variable that references **no object**.
- Always **check for null values** before calling methods.
- Use conditional checks or the `Objects.requireNonNull()` method to avoid such errors.
