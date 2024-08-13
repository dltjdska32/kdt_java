package chap14;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo {

    public static void main(String[] args) {
        int[] ia = {2, 3, 5, 7, 11, 13};
        IntStream is = Arrays.stream(ia);
        IntStream is2 = IntStream.iterate(1, x -> x + 2);
        IntStream is3 = new Random().ints(0, 10);

        String[] strings = {"The", "pen", "is", "mighter", "than", "the", "sword"};
        Stream<String> ss = Stream.of(strings);

        double[] da = {1.2, 3.14, 5.8, 0.2};
        DoubleStream ds = DoubleStream.of(da);
        Stream<Double> ds3 = Stream.generate(Math::random);

    }
}
