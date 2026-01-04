import java.io.*;
import java.util.*;
class TokenizerExample16_10 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("sample.txt");
        StreamTokenizer inputStream = new StreamTokenizer(file);
        int tokenType = 0;
        int numberOfTokens = -1;
        do {
            tokenType = inputStream.nextToken();
            outputTtype(tokenType, inputStream);
            numberOfTokens++;
        } while (tokenType != StreamTokenizer.TT_EOF);
        System.out.println("Number of tokens =" + numberOfTokens);
    }
    private static void outputTtype(int ttype, StreamTokenizer inStream) {
        switch (ttype) {
            case StreamTokenizer.TT_EOF: System.out.println("TT_EOF"); break;
            case StreamTokenizer.TT_EOL: System.out.println("TT_EOL"); break;
            case StreamTokenizer.TT_NUMBER: System.out.println("TT_NUMBER : nval =" + inStream.nval); break;
            case StreamTokenizer.TT_WORD: System.out.println("TT_WORD : sval =" + inStream.sval); break;
            default: System.out.println("Unknown : nval =" + inStream.nval + "sval =" + inStream.sval); break;
        }
    }
}