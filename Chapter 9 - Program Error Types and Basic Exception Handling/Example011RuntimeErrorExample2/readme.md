# 💥 Run-Time Error Example 1 – File Does Not Exist  
**Topic:** Demonstrating `FileNotFoundException` when trying to open a missing file using `FileReader`

---

## 🧩 Problem
Write a Java program that tries to **open and read a file named `names.txt`** using `FileReader`.  
If the file does not exist in the specified path, Java will throw a **Run-Time Error**:
```
java.io.FileNotFoundException
```

This error occurs **during execution**, not at compile time.

---

## ❌ Incorrect Code
```java
import java.io.FileReader;

class Example011RuntimeErrorExample1 {
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
    at Example011RuntimeErrorExample1.main(Example011RuntimeErrorExample1.java:6)
```

Even though the program compiles fine, the error appears **only at run-time**, when Java attempts to access the missing file.

---

## ✅ Correct Code
```java
package Example011RuntimeErrorExample1;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Example011RuntimeErrorExample1Solution {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("names.txt"); // Try to open file
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'names.txt' was not found.");
        }
    }
}
```

---

## 🧾 Explanation of Solution
- The `FileReader` constructor throws a **checked exception** if the file doesn’t exist.  
- To handle it properly, wrap the file access code inside a **try-catch** block.  
- The `catch` block prints a meaningful error message instead of letting the program crash.

---

## ✅ Output (if file is missing)
```
Error: The file 'names.txt' was not found.
```

If the file exists in the correct directory, the output will be:
```
File opened successfully!
```

---

## 🧠 Key Takeaway
- **Run-time errors** like file-not-found happen while the program is executing.  
- They can’t always be detected by the compiler.  
- Always handle file I/O operations using **try-catch** to ensure your program doesn’t crash unexpectedly.
