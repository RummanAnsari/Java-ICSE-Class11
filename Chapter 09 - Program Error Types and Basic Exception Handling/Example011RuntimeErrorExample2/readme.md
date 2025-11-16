# 💥 Run-Time Error Example 2 – File Handling with Absolute Path  
**Topic:** Handling `IOException` and avoiding `FileNotFoundException` by using an **absolute file path** and **safe resource handling** with `try-with-resources`.

---

## 🧩 Problem
Write a Java program that tries to **open and read a file named `names.txt`** located in a specific folder.  
If the file is missing or unreadable, the program should handle it gracefully without crashing.

---

## ❌ Incorrect Code
```java
import java.io.FileReader;

class Example011RuntimeErrorExample2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("names.txt"); // ❌ File may not exist
            System.out.println("File opened successfully!");
        } catch (Exception e) {
            System.out.println("Error occurred!");
        }
    }
}
```

---

## 💬 Error Explanation
If the file **`names.txt`** does not exist in the working directory,  
the JVM will throw a **`FileNotFoundException`**, which is a **checked exception**.

Example error message:
```
Exception in thread "main" java.io.FileNotFoundException: names.txt (The system cannot find the file specified)
    at java.io.FileInputStream.open0(Native Method)
    at java.io.FileInputStream.open(FileInputStream.java:213)
    at java.io.FileInputStream.<init>(FileInputStream.java:153)
    at java.io.FileReader.<init>(FileReader.java:75)
    at Example011RuntimeErrorExample2.main(Example011RuntimeErrorExample2.java:6)
```

Even though the program compiles fine, the error appears **only at run-time**, when Java attempts to access the missing file.

---

## ✅ Correct Code
```java
package Example011RuntimeErrorExample2;

import java.io.*;

public class Example011RuntimeErrorExample2Solution {
    public static void main(String[] args) {
        // ✅ Use the full absolute path to ensure file is found
        String filePath = "E:\6. Study Material\class 1 -12\CLASS11-ISC-computer\Java-ICSE-Class11\Chapter 9 - Program Error Types and Basic Exception Handling\Example011RuntimeErrorExample2\names.txt";

        File file = new File(filePath);
        System.out.println("Looking for file in: " + file.getAbsolutePath());

        // 🧩 Check if file exists before reading
        if (!file.exists()) {
            System.out.println("❌ Error: The file 'names.txt' was not found in this directory.");
            return;
        }

        // 📖 Read file content safely using try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("✅ File opened successfully!\n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("⚠️ Error reading the file: " + e.getMessage());
        }
    }
}
```

---

## 🧾 Explanation of Solution
| Concept | Explanation |
|----------|--------------|
| **Absolute Path** | Ensures Java knows the exact location of `names.txt`. No confusion about the working directory. |
| **File Existence Check** | Prevents exceptions by checking `file.exists()` before trying to open it. |
| **try-with-resources** | Automatically closes `BufferedReader` after use, avoiding resource leaks. |
| **IOException Handling** | Catches and displays any read/close errors instead of crashing. |

---

## ✅ Output (if file exists)
```
Looking for file in: E:\6. Study Material\class 1 -12\CLASS11-ISC-computer\Java-ICSE-Class11\Chapter 9 - Program Error Types and Basic Exception Handling\Example011RuntimeErrorExample2\names.txt
✅ File opened successfully!

Rumman Ansari
Java Programming
Exception Handling Example
```

*(Output will vary depending on the contents of your `names.txt` file.)*

---

## ❌ Output (if file missing)
```
Looking for file in: E:\6. Study Material\class 1 -12\CLASS11-ISC-computer\Java-ICSE-Class11\Chapter 9 - Program Error Types and Basic Exception Handling\Example011RuntimeErrorExample2\names.txt
❌ Error: The file 'names.txt' was not found in this directory.
```

---

## 🧠 Key Takeaway
- Use **absolute paths** during development to avoid file location confusion.  
- Always use **try-with-resources** for safe file handling.  
- Handle **checked exceptions** like `IOException` properly to make your code more robust and user-friendly.
