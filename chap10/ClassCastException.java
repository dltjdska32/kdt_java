package chap10;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class ClassCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);


        Cat cat = new Cat();
        changeDog(cat); //class cast exception 발생 -> 다른 형식으로 캐스팅을 하기때문에 dog면 dog
                        // / cat이면 cat으로 캐스팅

    }


    // 오류 o
    public static void changeDog(Animal animal) {
        Dog dog = (Dog) animal;
    }


    //오류 x
    public static void chagneAni(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }
        else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
        }
    }


}
