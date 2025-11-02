package Example8SemanticErrorExample3;

public class Example8SemanticErrorExample3 {
    public static void main(String[] args) {
       //  String s = "Hello";
        
       // int a = 5 - s;  // ❌ Invalid: cannot subtract a String from an int        
        
        // Solution
        int a = 5;  // ✅ Correct: assign an integer value
        System.out.println(a);
    }
}
