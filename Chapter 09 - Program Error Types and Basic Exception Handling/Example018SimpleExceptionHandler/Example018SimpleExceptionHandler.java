package Example018SimpleExceptionHandler;

import java.io.*;

public class Example018SimpleExceptionHandler {
    public static void main(String[] args) {
        // ✅ Use the correct full absolute path
        String filePath = "E:\\6. Study Material\\class 1 -12\\CLASS11-ISC-computer\\Java-ICSE-Class11\\Chapter 9 - Program Error Types and Basic Exception Handling\\Example018SimpleExceptionHandler\\sample.txt";

        File file = new File(filePath);
        System.out.println("Looking for file at: " + file.getAbsolutePath());

        if (!file.exists()) {
            System.out.println("❌ Error: The file 'sample.txt' was not found at the above location.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("✅ File opened successfully! Reading contents:\n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error while reading the file: " + e.getMessage());
        }
    }
}
