import java.io.*;
public class ExtractData {
    public static void main(String[] args) {
        try {
            int rno; float marks;
            DataOutputStream dw = new DataOutputStream(new FileOutputStream("Toppers.dat"));
            DataInputStream dr = new DataInputStream(new FileInputStream("stu.dat"));
            boolean EOF = false;
            while (!EOF) {
                try {
                    rno = dr.readInt();
                    marks = dr.readFloat();
                    if (marks > 75) {
                        dw.writeInt(rno);
                        dw.writeFloat(marks);
                    }
                } catch (EOFException e1) {
                    EOF = true;
                }
            }
            dw.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}