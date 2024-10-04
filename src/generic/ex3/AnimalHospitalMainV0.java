package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    /**
     * 코드 재사용 X: 동물 종류마다 병원 클래스를 만들어야 한다.
     * 타입 안정성 O
     */
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냐옹1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달 > 컴파일 오류
//        dogHospital.set(cat);

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
