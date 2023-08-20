import java.io.*;
class BufferedOutputStreamReset {
    public static void main(String args[]) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
            String data = "Hello, world!";
            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);
            System.out.println("Data written to BufferedOutputStream:");
            System.out.println(byteArrayOutputStream.toString());
            bufferedOutputStream.flush();
            byteArrayOutputStream.reset();
            System.out.println("\nData after resetting the BufferedOutputStream:");
            System.out.println(byteArrayOutputStream.toString());

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing: " + e.getMessage());
            }
        }
    }
}
