package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막 위치 추가: O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가: O(n)
        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        // 마지막 위치 삭제: O(1)
        Object removed1 = list.remove(4);
        System.out.println("removed(4)=" + removed1);
        System.out.println(list);

        // 원하는 위치 삭제: O(n)
        Object removed2 = list.remove(0);
        System.out.println("removed(0)=" + removed2);
        System.out.println(list);
    }
}
