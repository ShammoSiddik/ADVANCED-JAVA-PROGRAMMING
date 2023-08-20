import java.io.*;

class BufferedInputStreamReset {
    public static void main(String args[]) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        
        try {
            fileInputStream = new FileInputStream("Advance Java Program.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedInputStream.mark(1024);
            int character;
            System.out.println("Reading from BufferedInputStream:");
            while ((character = bufferedInputStream.read()) != -1) {
                System.out.print((char) character);
            }
            bufferedInputStream.reset();
            System.out.println("\nReading from BufferedInputStream after reset:");
            while ((character = bufferedInputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
