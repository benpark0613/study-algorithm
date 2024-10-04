package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        // Object 클래스를 활용하여 코드를 재사용할 수 있다.
        //  - 타입 안정성 문제
        //      integerBox에는 integer만, stringBOx에는 문자열만 입력할 수 있어야 한다.
        //      하지만, objectBox에 저장하는 매개변수가 object 타입이기 때문에 다른 타입의 값을 입력할 수 있다.
        //      그리고 반환 시점에도 Object를 반환하기 때문에 반환 타입을 정확히 알아야 하고, 다운 캐스팅을 해야한다.
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer : " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str : " + str);

        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result : " + result);
    }
}
