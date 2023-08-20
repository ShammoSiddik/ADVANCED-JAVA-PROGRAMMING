/* import java.io.*;
class ByteArrayInputStreamDemo {
    public static void main(String args[]) throws IOException {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
}
} */

import java.io.*;

class ByteArrayInputStreamDemo {
    public static void main(String args[]) throws IOException {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();
        
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
        
        int character;
        
        // Reading and printing characters from input1
        System.out.println("Reading from input1:");
        while ((character = input1.read()) != -1) {
            System.out.print((char) character);
        }
        System.out.println(); // Add a newline
        
        // Reading and printing characters from input2
        System.out.println("Reading from input2:");
        while ((character = input2.read()) != -1) {
            System.out.print((char) character);
        }
        System.out.println(); // Add a newline
        
        // Close the input streams
        input1.close();
        input2.close();
    }
}
