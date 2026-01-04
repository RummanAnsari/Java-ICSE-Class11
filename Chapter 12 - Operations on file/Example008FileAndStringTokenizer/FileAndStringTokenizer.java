import java.io.*;
import java.util.*;
class FileAndStringTokenizer {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("names.txt");
        BufferedReader fileInput = new BufferedReader(file);
        String text;
        int i = 0;
        int numberOfTokens = 0;
        while ((text = fileInput.readLine()) != null) {
            StringTokenizer dataLine = new StringTokenizer(text);
            numberOfTokens = numberOfTokens + dataLine.countTokens();
        }
        System.out.println("Number of tokens =" + numberOfTokens);
        fileInput.close();
    }
}