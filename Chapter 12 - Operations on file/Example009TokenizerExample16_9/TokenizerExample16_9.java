import java.io.*;
import java.util.*;
class TokenizerExample16_9 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("TokenizerExample16_9.java");
        StreamTokenizer inputStream = new StreamTokenizer(file);
        int tokenType = 0;
        int numberOfTokens = -1;
        do {
            tokenType = inputStream.nextToken();
            numberOfTokens++;
        } while (tokenType != StreamTokenizer.TT_EOF);
        System.out.println("Number of tokens =" + numberOfTokens);
    }
}