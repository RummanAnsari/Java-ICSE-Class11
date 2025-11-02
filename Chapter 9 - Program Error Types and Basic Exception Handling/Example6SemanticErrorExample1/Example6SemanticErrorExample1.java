package Example6SemanticErrorExample1;

public class Example6SemanticErrorExample1 {
    public static void main(String[] args) {
        // int i;   // Declared but not initialized
        // i++;     // Using variable before assigning a value

        // Solution
        int i = 0; // Initialize variable before use    
        i++;
        
        System.out.println("Value of i: " + i);
    }
}