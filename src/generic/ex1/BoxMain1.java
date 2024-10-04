package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        // 제네릭이 없다면, 같은 기능을 하는 클래스를 각각의 타입 별로 새로 만들어야 한다.
        // ex) DoubleBox, BooleanBox ...
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("test");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
