package Example7SemanticErrorExample2;

public class Example7SemanticErrorExample2Solution {
    public static void main(String[] args) {
        int a = 10;                 // ✅ Correct numeric assignment
        System.out.println(a);

        String b = "Hello";         // ✅ Correct text assignment
        System.out.println(b);
    }
}