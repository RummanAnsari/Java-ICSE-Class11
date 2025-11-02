# ⚙️ Example 025 – Array Index Out of Bounds Exception  
**Topic:** Demonstrating an `ArrayIndexOutOfBoundsException` in Java.  

---

## 🧩 Problem  
Write a short Java code snippet that intentionally causes an **ArrayIndexOutOfBoundsException** by attempting to access an element outside the valid range of an array.  

---

## 💡 Objective  
To understand what happens when a program tries to access an invalid index in an array and how Java handles such exceptions automatically.  

---

## 🧱 Basic Concept  
- Arrays in Java are **zero-indexed** (the first element is at index `0`).  
- If an index greater than or equal to the array length (or less than `0`) is accessed, Java throws an `ArrayIndexOutOfBoundsException`.  
- This type of exception occurs **at runtime**.  

---

## 💻 Example Code  
```java
package Example025ArrayIndexOutOfBounds;

public class Example025ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = new int[50]; // Array with 50 elements (index 0–49)
        System.out.println("Array length: " + numbers.length);

        // 🚫 Attempt to access an invalid index
        System.out.println("Accessing element at index 60...");
        System.out.println(numbers[60]);  // This line throws an exception
    }
}
```

---

## 🧾 Explanation  
- The array `numbers` is created with 50 elements, indexed from **0 to 49**.  
- When the program tries to access index `60`, Java throws an **ArrayIndexOutOfBoundsException**.  
- This demonstrates how Java prevents illegal memory access.  

---

## ⚠️ Output  
```
Array length: 50
Accessing element at index 60...
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 60 out of bounds for length 50
    at Example025ArrayIndexOutOfBounds.Example025ArrayIndexOutOfBounds.main(Example025ArrayIndexOutOfBounds.java:9)
```

---

## 🧠 Key Takeaways  
- Always check array indices before accessing elements.  
- Array index values must be **>= 0** and **< array.length**.  
- Understanding such runtime errors helps in writing safer code.  
