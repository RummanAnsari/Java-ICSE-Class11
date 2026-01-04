///
/// Reading data from a text file
/// This program reads the contents of "names.txt" and displays them on the monitor using `FileReader` and `BufferedReader` classes.
///


import java.io.*;
class FileIOExceptionExample2 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("E:\\6. Study Material\\class 1 -12\\CLASS11-ISC-computer\\Java-ICSE-Class11\\Chapter 12 - Operations on file\\Example002IO\\names.txt");
        BufferedReader fileInput = new BufferedReader(file);
        String text;
        int i = 0;
        while ((text = fileInput.readLine()) != null) {
            i++;
            System.out.print("Name " + i + " : ");
            System.out.println(text);
        }
        fileInput.close();
    }
}