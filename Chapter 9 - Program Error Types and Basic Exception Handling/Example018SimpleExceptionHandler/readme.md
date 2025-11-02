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
        // ✅ Updated to use absolute path for proper file access
        String filePath = "E:\\6. Study Material\\class 1 -12\\CLASS11-ISC-computer\\Java-ICSE-Class11\\Chapter 9 - Program Error Types and Basic Exception Handling\\Example018SimpleExceptionHandler\\sample.txt";

        File file = new File(filePath);
        System.out.println("Looking for file at: " + file.getAbsolutePath());

        if (!file.exists()) {
            System.out.println("❌ Error: The file 'sample.txt' was not found at the above location.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("✅ File opened successfully! Reading contents:\n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error while reading the file: " + e.getMessage());
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
Looking for file at: E:\6. Study Material\class 1 -12\CLASS11-ISC-computer\Java-ICSE-Class11\Chapter 9 - Program Error Types and Basic Exception Handling\Example018SimpleExceptionHandler\sample.txt
✅ File opened successfully! Reading contents:

<Contents of sample.txt>
```

If `sample.txt` does not exist:
```
❌ Error: The file 'sample.txt' was not found at the above location.
```
