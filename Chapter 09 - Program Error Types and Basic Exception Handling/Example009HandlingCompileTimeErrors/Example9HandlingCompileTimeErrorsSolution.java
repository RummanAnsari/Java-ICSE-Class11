package Example009HandlingCompileTimeErrors;

public class Example9HandlingCompileTimeErrorsSolution {
    void m(int n) {
        int j = 0;  // ✅ Initialize variable to a default value
        if (n > 5)
            j = 10;
        System.out.println(j);
    }

    public static void main(String[] args) {
        Example9HandlingCompileTimeErrorsSolution obj = new Example9HandlingCompileTimeErrorsSolution();
        obj.m(3);  // Output: 0
        obj.m(8);  // Output: 10
    }
}
