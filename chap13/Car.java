package chap13;

import java.util.Arrays;
import java.util.List;

public class Car {
    private String model;
    private String manufacture;  //true 가솔린 false 디젤
    private int age;
    private int mileage;
    public Car(){};
    public Car(String model, String manufacture, int age, int mileage) {
        this.model = model;
        this.manufacture = manufacture;
        this.age = age;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getAge() {
        return age;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", manufacture=" + manufacture +
                ", age=" + age +
                ", mileage=" + mileage +
                '}';
    }



    public static final List<Car> cars = Arrays.asList(
            new Car("소나타", "현대", 18, 210000),
            new Car("코란도", "kgm", 15, 200000),
            new Car("그랜저", "현대", 12, 150000),
            new Car("싼타페", "kgm", 10, 220000),
            new Car("아반테", "현대", 10, 70000),
            new Car("에쿠스", "기아", 6, 100000),
            new Car("그랜저", "현대", 5, 80000),
            new Car("소나타", "기아", 2, 35000),
            new Car("쏘렌토", "kgm", 1, 10000),
            new Car("아반테", "기아", 1, 7000));

}
