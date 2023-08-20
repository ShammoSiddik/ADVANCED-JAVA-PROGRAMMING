import java.io.*;

class BufferedOutputStreamDemo {
    public static void main(String args[]) {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        
        try {
            fileOutputStream = new FileOutputStream("Advance Java Program.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String data = "Hello, world!";
            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);
            
            System.out.println("Data written to BufferedOutputStream.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing: " + e.getMessage());
            }
        }
    }
}
