package chap11;

public class GarbageDemo
{
    public static void main(String[] args) {
        makeGarbage(1);
        makeGarbage(2);
        makeGarbage(3);
        makeGarbage(4);
        makeGarbage(5);

        try{
            Thread.sleep(3000);
            System.gc();
        } catch(Exception e){
            System.out.println("예외~");
        }

    }

    private static void makeGarbage(int i) {

        Garbage gb = new Garbage(i);
    }
}
