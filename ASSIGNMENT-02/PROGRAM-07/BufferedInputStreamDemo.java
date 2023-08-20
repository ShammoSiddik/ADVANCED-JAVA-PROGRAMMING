import java.io.*;

class BufferedInputStreamDemo {
    public static void main(String args[]) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        
        try {
            fileInputStream = new FileInputStream("Advance Java Program.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int character;
            System.out.println("Reading from BufferedInputStream:");
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
