# ⚠️ Semantic Error Example 4: Using a Keyword as a Variable Name (`int default = 10;`)

## ❌ Incorrect Code
```java
class SemanticErrorExample4 {
    public static void main(String[] args) {
        int default = 10;  // 'default' is a reserved keyword in Java
        System.out.println("Value: " + default);
    }
}
```

## 💬 Explanation
In Java, certain words (like `class`, `int`, `if`, `default`, `for`, etc.) are **reserved keywords**.  
These words have predefined meanings in the Java language and **cannot be used as identifiers** — such as variable names, method names, or class names.

Attempting to use a keyword as a variable name causes a **compile-time semantic error**, typically shown as:

```
error: as of release X, 'default' is a keyword, and may not be used as an identifier
```

## ✅ Correct Code
```java
class SemanticErrorExample4 {
    public static void main(String[] args) {
        int defaultValue = 10;  // Renamed variable to a valid identifier
        System.out.println("Value: " + defaultValue);
    }
}
```

---

### 🧠 Key Takeaway
- **Keywords cannot be used as identifiers.**  
- Always choose descriptive variable names that are **not reserved by Java**.  
- Example of reserved words: `public`, `private`, `class`, `static`, `void`, `default`, `int`, etc.
