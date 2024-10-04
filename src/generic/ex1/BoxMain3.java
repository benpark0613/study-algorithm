package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        // 제네릭을 사용하여 다형성 구현: 생성 시점에 원하는 타입을 지정한다.
        // 코드 재사용 O, 타입 안정성 O
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("십"); // 컴파일 오류: Integer 타입만 허용
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
    }
}
