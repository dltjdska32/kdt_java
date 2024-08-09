package chap12.rambda;

import java.util.ArrayList;
import java.util.List;

public class CarsDemo {

    public static void main(String[] args) {
        List<Car> dieselCars = findCars(Car.cars, c -> !c.isGasoline());
        System.out.println("디젤 차 : " + dieselCars);

        List<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
        System.out.println("오래된 차 : " + oldCars);

        List<Car> oldDieselCars = findCars(Car.cars, c -> c.getAge() > 10 && !c.isGasoline());
        System.out.println("오래된 디젤 차 : " + oldDieselCars);

        System.out.print("디젤 차 : " );
        printCars(dieselCars, c -> System.out.printf("%s(%d)", c.getModel(), c.getAge()));
        System.out.print("\n오래된 차 : ");
        printCars(oldCars, c -> System.out.printf("%s(%d, %d)", c.getModel(), c.getAge(), c.getMileage()));
    }


    public static List<Car> findCars(List<Car> cars, CarPredicate cp) {
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (cp.test(car)) {
                result.add(car);
            }
        }
        return result;
    }

    public static void printCars(List<Car> cars, CarConsumer cc) {
        for(Car car : cars) {
            cc.apply(car);
        }
    }
}
