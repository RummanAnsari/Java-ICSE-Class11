package Example014LogicalErrorExample2;

public class Example014LogicalErrorExample2Solution {
    public static void main(String[] args) {
        String s = "Hello";
        int count = 0;
        
        //   while (s != null) {  // ❌ Logical error: 's' never becomes null
        while (s != null && count < 5) {  // ✅ Added condition to terminate
            System.out.println("Inside loop iteration: " + (count + 1));
            count++;
            if (count == 5) {
                s = null;  // Now 's' becomes null, and loop stops
            }
        }

        System.out.println("Loop ended successfully.");
    }
}