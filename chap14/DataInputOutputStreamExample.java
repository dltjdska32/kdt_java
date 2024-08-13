package chap14;

import java.io.*;

public class DataInputOutputStreamExample {

    static String fileName = "C:/Users/dltjd/kdt_java/chap14/test.txt";

    public static void main(String[] args) {
        try {
            runMethod();
        } catch (Exception e) {

        }
    }

    private static void runMethod() throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF(" 홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);
        dos.writeUTF("감자바");
        dos.writeDouble(90.5);
        dos.writeInt(2);
        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);
        DataInputStream dis = new DataInputStream(fis);
        for(int i = 0; i < 2; i++){
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);

        }
        dis.close();
        fis.close();
    }

}
