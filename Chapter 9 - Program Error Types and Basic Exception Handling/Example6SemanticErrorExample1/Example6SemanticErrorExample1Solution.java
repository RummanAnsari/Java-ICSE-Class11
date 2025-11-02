package Example6SemanticErrorExample1;

public class Example6SemanticErrorExample1Solution {
      public static void main(String[] args) {
        int i = 0;   // Variable initialized before use
        i++;         // Incrementing the initialized variable
        System.out.println("Value of i: " + i);
    }
}
