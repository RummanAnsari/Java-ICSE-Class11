import java.io.*;
public class CopyFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Copy.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter outFile = new PrintWriter(bw);
            FileReader file = new FileReader("names.txt");
            BufferedReader fileInput = new BufferedReader(file);
            String text;
            while ((text = fileInput.readLine()) != null) {
                outFile.println(text);
            }
            System.out.println("File successfully copied!!");
            fileInput.close();
            outFile.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}