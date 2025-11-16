package Example011RuntimeErrorExample2;

import java.io.*;

public class Example011RuntimeErrorExample2Solution {
    public static void main(String[] args) {
        // 🔒 Use the full absolute path to your names.txt
        String filePath = "E:\\6. Study Material\\class 1 -12\\CLASS11-ISC-computer\\Java-ICSE-Class11\\Chapter 9 - Program Error Types and Basic Exception Handling\\Example011RuntimeErrorExample2\\names.txt";

        File file = new File(filePath);
        System.out.println("Looking for file in: " + file.getAbsolutePath());

        if (!file.exists()) {
            System.out.println("❌ Error: The file 'names.txt' was not found in this directory.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("✅ File opened successfully!\n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error reading the file: " + e.getMessage());
        }
    }
}
