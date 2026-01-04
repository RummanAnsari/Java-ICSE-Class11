import java.io.*;
import java.util.*;
class TokenizerExample {
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader keyboardInput = new BufferedReader(input);
    public static void main(String[] args) throws IOException {
        int numberOfTokens = 0;
        System.out.println("Input a string");
        StringTokenizer data = new StringTokenizer(keyboardInput.readLine());
        numberOfTokens = data.countTokens();
        System.out.println("Number of tokens =" + numberOfTokens + "\n");
        for (int counter = 0; counter < numberOfTokens; counter++) {
            System.out.println(data.nextToken());
        }
    }
}