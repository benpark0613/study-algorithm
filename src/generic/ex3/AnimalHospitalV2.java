package generic.ex3;

public class AnimalHospitalV2<T> {
    /**
     * 제네릭 타입을 선언하면 자바 컴파일러 입장에서 T에 어떤 값이 들어올 지 예측할 수 없다.
     * 때문에 자바 컴파일러는 T를 모든 객체의 최종 부모인 Object 타입으로 가정한다. 따라서,
     * Object 가 제공하는 메서드만 호출할 수 있다. 이로 인해 Integer, Object 와 같은
     * 동물과 관계 없는 타입을 타입 인자로 전달할 수 있는 문제가 있다.
     * 타입 인자를 Animal 이나 그 자식으로 제한할 필요가 있다.
     */
    private T animal;

    public void setA(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);
    }

    public T getBigger(T target) {
        return null;
    }
}
