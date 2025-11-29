# ArraySumExample -- Easy Explanation for Class 10 Students

This program shows how to **add all the numbers inside an array** using
a simple **for loop** in Java.

------------------------------------------------------------------------

## 📘 What This Program Does

-   It has an array of 5 numbers: `10, 20, 30, 40, 50`
-   It goes through each number one by one
-   It keeps adding them to get the total sum
-   Finally, it prints the total

------------------------------------------------------------------------

## 🧠 Important Concepts (Explained Simply)

### ✅ 1. What is an Array?

An **array** is like a row of boxes.\
Each box stores one number.

Example:\
`int[] numbers = {10, 20, 30, 40, 50};`

This means: - numbers\[0\] = 10\
- numbers\[1\] = 20\
- numbers\[2\] = 30\
- numbers\[3\] = 40\
- numbers\[4\] = 50

------------------------------------------------------------------------

### ✅ 2. What is a Loop?

A loop is used when you want to repeat something multiple times.

Here we use a **for loop** to go through every number in the array.

------------------------------------------------------------------------

### ✅ 3. How the Sum Works

We start with:

    sum = 0

Then we add each number to it:

    sum = sum + numbers[i];

This happens 5 times because the array has 5 elements.

------------------------------------------------------------------------

## 🖥 Program Code

``` java
public class ArraySumExample {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        // Using a for loop to calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array elements is: " + sum);

    }
}
```

------------------------------------------------------------------------

## 📤 Output Example

    The sum of the array elements is: 150

------------------------------------------------------------------------

## 📝 Summary for Class 10 Students

  Concept          Meaning
  ---------------- ----------------------------------------
  Array            Stores multiple values in one variable
  Loop             Repeats actions automatically
  Sum              Adding numbers step-by-step
  numbers.length   Total number of elements in the array

------------------------------------------------------------------------

## 🎉 Final Understanding

This program teaches you:\
✔ How to store multiple values using arrays\
✔ How to use a loop to process each value\
✔ How to calculate the sum of numbers

This is a basic but very important concept in programming!
