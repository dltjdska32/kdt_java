package chap11;

public class Garbage {
    public int no;

    public Garbage(int no) {
        this.no = no;
        System.out.printf("가비지(%d) 생성 \n", no);
    }

    protected void finalize() {
        System.out.printf("가비지(%d) 수거 \n", no);
    }
}
