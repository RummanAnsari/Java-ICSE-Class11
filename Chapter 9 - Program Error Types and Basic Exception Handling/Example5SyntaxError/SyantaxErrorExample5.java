package Example5SyntaxError;

public class SyantaxErrorExample5 {
    static int max(int i, int j) {
        if (i > j)
            // return;  // Missing return value
            return i;
        else
            // return;  // Missing return value
            return j;
    }

    public static void main(String[] args) {
        int result = max(10, 5);
        System.out.println("Maximum value is: " + result);
    }
}
