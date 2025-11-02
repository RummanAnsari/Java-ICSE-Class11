package Example4SemanticError;

public class SemanticErrorExample4 {
        public static void main(String[] args) {
        // int default = 10;  // 'default' is a reserved keyword in Java
        // System.out.println("Value: " + default);

        // Solution
        int defaultValue = 10;  // Renamed variable to a valid identifier       
        System.out.println("Value: " + defaultValue);
    }
}
