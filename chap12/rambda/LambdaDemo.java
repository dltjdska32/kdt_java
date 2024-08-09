package chap12.rambda;



interface Negative {
    int neg(int x);

}

interface Printable {
    void print();
}



class ClassNega implements Negative {
    public int neg(int x) {
        return -x;
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        Negative neg = new ClassNega();


        // 람다식 - 인터페이스에 함수가 하나만 정의되어 있어야함.
        neg = (int x) -> {
            return -x;
        };
        neg = (x) -> {
            return -x;
        };
        neg = x -> {
            return -x;
        };
        neg = (int x) -> -x;
        neg = (x) -> (-x);
        neg = x -> -x;

        System.out.println(neg.neg(5));

        Printable p;
        p = () -> { System.out.println("안녕!"); };
        p.print();
        p = () -> System.out.println("안녕!");
        p.print();
    }

}
