import java.io.*;
import java.util.*;
class StringProcessing {
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader keyboardInput = new BufferedReader(input);
    public static void main(String[] args) throws IOException {
        System.out.println("Input a string");
        String data = keyboardInput.readLine();
        int numberCharacters = data.length();
        System.out.println("Number of characters = " + numberCharacters + "\n");
        for (int counter = 0; counter < numberCharacters; counter++) {
            char character = data.charAt(counter);
            if (character == ' ')
                System.out.println();
            else
                System.out.print(character);
        }
        System.out.println("\n");
    }
}