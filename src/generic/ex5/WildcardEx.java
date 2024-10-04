package generic.ex5;

import generic.animal.Animal;

/**
 *  - 제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 <T>을 사용하고,
 *  그렇지 않은 상황이면 와일드카드를 사용하는 것을 권장한다.
 */
public class WildcardEx {
    /**
     *  - 비제한 와일드카드
     *      - 외일드카드는 제네릭 타입이나 제네릭 메서드를 정의할 때 사용하는 것이 아니다.
     *      - Box<Dog>, Box<Cat> 처럼 타입인자가 정해진 제네릭 타입을 전달 받아서 활용할 때 사용한다.
     *      - 와일드카드 ? 는 모든 타입을 다 받을 수 있다는 뜻이다. 모든 타입을 다 받을 수 있는 와일드카드를
     *      비제한 와일드카드라 한다.
     *      - 와일드카드는 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐이다.
     */
    // 제네릭 메서드다.
    // Box<Dog> dogBox를 전달한다. 타입추론에 의해 타입 T가 Dog이 된다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }
    // 제네릭 메서드가 아니다. 일반적인 메서드다.
    // Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    /**
     *  - 상한 와일드카드
     */
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    /**
     *  - 타입 매개변수가 꼭 필요한 경우
     *      - 와일드카드는 제네릭을 정의할 때 사용하는 것이 아니다. 인자가 전달된 제네릭 타입을
     *      활용할 때 사용한다.
     *      - printAndReturnWildcar() 와 같이 전달한 타입을 명확하게 반환할 수 없을 경우,
     *      제네릭타입이나 제네릭 메서드를 사용해야한다.
     *      - 메서드의 타입들을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메서드를 사용해야 한다.
     */
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
