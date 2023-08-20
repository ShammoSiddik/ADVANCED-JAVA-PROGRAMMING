import java.io.*;

class ByteArrayInputStreamReset {
    public static void main(String args[]) throws IOException {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();
        
        ByteArrayInputStream input = new ByteArrayInputStream(b);
        System.out.println("Reading from input:");
        int character;
        while ((character = input.read()) != -1) {
            System.out.print((char) character);
        }
        System.out.println();
        input.reset();
        System.out.println("Reading from input after reset:");
        while ((character = input.read()) != -1) {
            System.out.print((char) character);
        }
        input.close();
    }
}
