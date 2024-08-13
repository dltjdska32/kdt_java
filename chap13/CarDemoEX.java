package chap13;

import chap12.rambda.CarsDemo;

import java.util.*;
import java.util.function.Consumer;

import static chap13.Car.cars;

public class CarDemoEX {



    public static void main(String[] args) {

        Car car1 = new Car();
        int max = 0;
        for (Car c : cars) {
            if(c.getMileage() >= max){
                max = c.getMileage();
                car1 = c;
            }
        }

        System.out.println(car1);


        List<Car> manufacturer1 = new ArrayList<>();
        List<Car> manufacturer2 = new ArrayList<>();
        List<Car> manufacturer3 = new ArrayList<>();

        for (Car car : cars) {
            if (car.getManufacture().equals("현대")) {
                manufacturer1.add(car);
            } else if (car.getManufacture().equals("기아")){
                manufacturer2.add(car);
            } else if (car.getManufacture().equals("kgm")) {
                manufacturer3.add(car);
            }
        }

        Consumer<Car> cons = x -> System.out.println("제조사 : " + x.getManufacture() + ", 모델명 : " + x.getModel());
        manufacturer1.forEach(cons);
        manufacturer2.forEach(cons);
        manufacturer3.forEach(cons);


        cars.sort((x, y) -> x.getManufacture().compareTo(y.getManufacture()));

//        for (Car car : cars) {
//            System.out.println(car);
//        }


        sortCar("model");
    }


    public static void sortCar(String s) {
        LinkedList<Car> sortList = new LinkedList<>(cars);
        Comparator<Car> comparator;

        s = s.toUpperCase();

        switch (s) {
            case "MODEL" : comparator = Comparator.comparing(Car::getModel); break;
            case "MANUFACTURER" : comparator = Comparator.comparing(Car::getManufacture); break;
            case "MILEAGE" : comparator = Comparator.comparing(Car::getMileage); break;
            case "AGE" : comparator = Comparator.comparing(Car::getAge); break;
            default : return;
        }

        System.out.println("before sort");
        showList(sortList);
        Collections.sort(sortList, comparator);
        showList(sortList);
    }

    public static <E> void showList(List<E> e) {
        for( E c : e) {
            System.out.print (c.toString() + " ");
        }
        System.out.println();
    }
}




