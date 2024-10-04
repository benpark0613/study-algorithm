package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Cat targetCat = new Cat("뚱냥이", 500);
        Cat bigger = AnimalMethod.getBigger(cat, targetCat);
        System.out.println("bigger = " + bigger);
    }
}
