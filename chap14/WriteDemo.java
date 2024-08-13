package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteDemo {
    public static void main(String[] args) {

        try{
            writeMethod1();
            writeMethod2();
            writeMethod3();
        } catch (Exception e){

        }
    }


    private static void writeMethod1() throws IOException {
        Writer writer = new FileWriter("C:/Users/dltjd/kdt_java/chap14/test.txt");

        char a = 'a';
        char b = 'b';
        char c = 'c';

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();
    }



    private static void writeMethod2() throws IOException {
        char[] a= {'A', 'B', 'C', 'D', 'E'};
        Writer writer2 = new FileWriter("C:/Users/dltjd/kdt_java/chap14/test.txt");

        writer2.write(a, 2, 3);//CDE


        writer2.flush();
        writer2.close();
    }



    private static void writeMethod3() throws IOException {
        Writer writer3 =  new FileWriter("C:/Users/dltjd/kdt_java/chap14/test.txt");

        String str = "ABCDEF";
        String str2 = """
                Hello Java! 
                My name is Tom""";

        writer3.write(str2);
        writer3.flush();
        writer3.close();
    }


}
