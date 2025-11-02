# ⚙️ Example 018 – Simple Exception Handler Code Structure  
**Topic:** Demonstrating the basic structure of `try` and `catch` for file handling in Java.

---

## 🧩 Problem  
Write a simple Java program that shows how to use a **try-catch block** to handle exceptions that may occur during file operations.  
The code demonstrates the **general pattern** for catching exceptions in Java.

---

## 💡 Objective  
To understand the **structure and purpose** of exception handling using `try` and `catch` statements in Java.

---

## 🧱 Basic Concept  
- The `try` block encloses the code that **might throw an exception**.  
- The `catch` block handles the exception, preventing the program from crashing.  
- This structure helps in writing **safe and fault-tolerant code**.

---

## 💻 Example Code  
```java
package Example018SimpleExceptionHandler;

import java.io.*;

public class Example018SimpleExceptionHandler {
    public static void main(String[] args) {
        DataInputStream file = null;

        try {
            // 🔒 Attempt to open a file for reading
            file = new DataInputStream(new FileInputStream("sample.txt"));
            System.out.println("File opened successfully!");
        } 
        catch (Exception e) {
            // ⚠️ Catch any kind of exception that occurs
            System.out.println("❌ Exception occurred while handling the file: " + e);
        }
        finally {
            // ✅ Ensures cleanup or closure
            try {
                if (file != null) {
                    file.close();
                    System.out.println("File closed successfully!");
                }
            } catch (IOException e) {
                System.out.println("⚠️ Error closing file: " + e);
            }
        }
    }
}
```

---

## 🧾 Explanation  
- The `try` block contains the **risky file-handling code**.  
- If the file does not exist or cannot be opened, an **exception** will be thrown.  
- The `catch` block catches the error and displays a meaningful message.  
- The `finally` block ensures that the file is **closed safely**, even if an exception occurs.  

---

## 🧠 Key Takeaways  
- The `try-catch-finally` structure is the foundation of Java's **exception handling**.  
- Always close file resources inside the `finally` block (or use **try-with-resources**).  
- Catching exceptions prevents **unexpected program termination**.  

---

## ✅ Output  
If `sample.txt` exists:
```
File opened successfully!
File closed successfully!
```

If `sample.txt` does not exist:
```
❌ Exception occurred while handling the file: java.io.FileNotFoundException: sample.txt (The system cannot find the file specified)
```
