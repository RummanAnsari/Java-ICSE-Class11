package Example012RuntimeErrorExample3;

public class Example012RuntimeErrorExample3Solution {
    public static void main(String[] args) {
        // String s = null; // ❌ s is null
        String s = "Hello"; // ✅ Properly initialized string
        System.out.println(s.concat(" World!")); // Works fine
    }
}