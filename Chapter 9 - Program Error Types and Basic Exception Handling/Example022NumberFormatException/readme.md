# 🧮 Example: Program13_4 – Handling NumberFormatException

**Topic:** Demonstrating how Java handles invalid numeric input using `try-catch` for `NumberFormatException`.

---

## 🧩 Problem
Write a program that attempts to convert a **string input to an integer**.  
If the input is not a valid number (e.g., “abc”), Java throws a **NumberFormatException**.

---

## 💡 Objective
To understand how to handle **invalid numeric input** gracefully using `try-catch`.

---

## 💻 Example Code
```java
package Example022NumberFormatException;

public class Program13_4 {
    public static void main(String[] args) {
        String strNumber = "abc"; // Invalid integer string

        try {
            // ⚙️ Attempt to parse the string into an integer
            int number = Integer.parseInt(strNumber);
            System.out.println("The number is: " + number);
        } 
        catch (NumberFormatException e) {
            // ⚠️ Handle invalid number format
            System.out.println("❌ Error: Invalid number format. Please enter numeric values only.");
        } 
        finally {
            // ✅ Always executes
            System.out.println("Program execution completed.");
        }
    }
}
```

---

## 🧾 Explanation
- `Integer.parseInt()` converts a string into an integer.  
- If the string does **not contain a valid integer**, Java throws a `NumberFormatException`.  
- The `catch` block captures this and prevents the program from crashing.  
- The `finally` block executes regardless of whether an exception occurs.

---

## ✅ Output (when input is invalid)
```
❌ Error: Invalid number format. Please enter numeric values only.
Program execution completed.
```

---

## ✅ Output (when input is valid)
If you change the input to `"123"`, output will be:
```
The number is: 123
Program execution completed.
```

---

## 🧠 Key Takeaways
- `NumberFormatException` occurs when a **non-numeric string** is parsed as a number.  
- Always use `try-catch` when converting user input to numbers.  
- The `finally` block runs **whether or not an exception occurs**.
