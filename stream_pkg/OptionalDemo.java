//package stream_pkg;
//
//import java.util.Optional;
//import java.util.OptionalDouble;
//import java.util.OptionalInt;
//
//import static chap10.ExceptionHandling06.method2;
//
//public class OptionalDemo {
//    public static void main(String[] args) {
//        OptionalInt i = OptionalInt.of(100);
//        OptionalDouble d = OptionalDouble.of(3.14);
//        Optional<String> s = Optional.of("Hello");
//
//        System.out.println(i.getAsInt());
//        System.out.println(d.getAsDouble());
//        System.out.println(s.get());
//
//
//        System.out.println(i);
//        System.out.println(d);
//        System.out.println(s);
//
//        System.out.println(divide(1.0, 2.0));
//        System.out.println(divide(1.0, 0.0));
//
//        method2();
//
//    }
//
//    public static void method2() {
//        String s1 = null;
//        Optional<String> o = Optional.ofNullable(s1);
//        System.out.println(s1);
//        if(s1 != null) {
//
//        }
//    }
//
//
//}
