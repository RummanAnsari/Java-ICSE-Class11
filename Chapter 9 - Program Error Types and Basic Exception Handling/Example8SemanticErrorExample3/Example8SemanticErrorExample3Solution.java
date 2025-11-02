package Example8SemanticErrorExample3;

public class Example8SemanticErrorExample3Solution {
    public static void main(String[] args) {
        int num = 5;
        String s = "3";

        // ✅ Convert String to integer before arithmetic operation
        int a = num - Integer.parseInt(s);
        System.out.println("Result after subtraction: " + a);
    }
}