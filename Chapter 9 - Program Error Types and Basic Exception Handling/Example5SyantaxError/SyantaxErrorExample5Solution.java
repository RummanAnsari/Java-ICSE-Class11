package Example5SyantaxError;

public class SyantaxErrorExample5Solution {
    static int max(int i, int j) {
        if (i > j)
            return i;  // Returns an integer value
        else
            return j;  // Returns an integer value
    }

    public static void main(String[] args) {
        int result = max(10, 5);
        System.out.println("Maximum value is: " + result);
    }
}
