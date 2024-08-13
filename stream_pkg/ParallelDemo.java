package stream_pkg;

import java.util.stream.IntStream;

public class ParallelDemo {
    public static void main(String[] args) {
        long start, end, total;

        IntStream sequential = IntStream.range(0, 100000000);
        start = System.currentTimeMillis();
        total = sequential.sum();
        end = System.currentTimeMillis();
        System.out.println("순차 처리 : " + (end - start) + " ms");

        IntStream parallel = IntStream.range(0, 100000000).parallel();
        start = System.currentTimeMillis();
        total = parallel.sum();
        end = System.currentTimeMillis();
        System.out.println("병렬 처리 : " + (end - start) + " ms");
    }
}
