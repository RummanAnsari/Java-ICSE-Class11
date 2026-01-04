// code to demonstrate StringTokenizer class
import java.io.*;
import java.util.*;
class TokenizerExample2 {
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader keyboardInput = new BufferedReader(input);
    public static void main(String[] args) throws IOException {
        int numberOfTokens = 0;
        int numberArray[];
        int total = 0; 
        System.out.print("Input a sequence of integers separated by commas(',') :");
        StringTokenizer data = new StringTokenizer(keyboardInput.readLine(), ",");
        numberOfTokens = data.countTokens();
        System.out.println("Number of tokens =" + numberOfTokens + "\n");
        numberArray = new int[numberOfTokens];
        for (int counter = 0; counter < numberOfTokens; counter++) {
            numberArray[counter] = new Integer(data.nextToken()).intValue();
            System.out.println(numberArray[counter]);
            total = total + numberArray[counter];
        }
        System.out.println("------\n" + total + "(average =" + total/numberOfTokens + ")");
    }
}