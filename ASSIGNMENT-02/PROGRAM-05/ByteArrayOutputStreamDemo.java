import java.io.*;

class ByteArrayOutputStreamDemo {
    public static void main(String args[]) throws IOException {
        ByteArrayOutputStream output1 = new ByteArrayOutputStream();
        ByteArrayOutputStream output2 = new ByteArrayOutputStream();
        String data1 = "Hello, ";
        byte[] bytes1 = data1.getBytes();
        output1.write(bytes1, 0, bytes1.length);
        String data2 = "world!";
        byte[] bytes2 = data2.getBytes();
        output2.write(bytes2, 0, bytes2.length);
        ByteArrayOutputStream combinedOutput = new ByteArrayOutputStream();
        combinedOutput.write(output1.toByteArray(), 0, output1.size());
        combinedOutput.write(output2.toByteArray(), 0, output2.size());
        byte[] combinedBytes = combinedOutput.toByteArray();
        System.out.println("Combined output:");
        System.out.println(new String(combinedBytes));
        
        // Close the output streams
        output1.close();
        output2.close();
        combinedOutput.close();
    }
}
