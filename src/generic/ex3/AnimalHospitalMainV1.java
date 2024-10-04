package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        // 코드 재사용 O: AnimalHospital 하나로 개와 고양이 모두 처리
        // 타입 안정성 X
        //  개 병원에 고양이 전달 가능
        //  Animal 타입 반환하기 때문에 다운 캐스팅 필요
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냐옹1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        // 매개변수 체크 실패 > 컴파일 오류 발생하지 않음
        dogHospital.set(cat);

        // 문제2: 개 타입 반환, 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
