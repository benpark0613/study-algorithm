package collection.array;

/**
 * - 문제점
 *  Object 를 사용하여 자료구조를 구현했기 때문에,
 *  코드를 재사용할 수 있으나 자료의 안정성은 떨어진다. > 제네릭 필요
 */
public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();
        // 숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("삼");
        System.out.println(numberList); // 문자 입력

        // 반환 타입이 Object이므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        // 예외 발생: 문자를 Integer로 캐스팅
        Integer num3 = (Integer) numberList.get(2);
    }
}
