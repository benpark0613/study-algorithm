package collection.link;

public class MyLinkedListV1 {
    private Node first; // 첫 노드의 위치
    private int size = 0; // 자료 구조에 입력된 데이터의 사이즈, 데이터가 추가될 때 마다 하나씩 증가한다.

    /**
     * - void add(Object e)
     *  - 마지막에 데이터를 추가한다.
     *  - 새로운 노드를 만들고, 마지막 노드를 찾아서 새로운 노드를 마지막에 연결한다.
     *  - 만약 노드가 하나도 없다면 새로운 노드를 만들고 first에 연결한다.
     */
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    /**
     * - Object set(int index, Object element)
     *  - 특정 위치에 있는 데이터를 찾아서 변경한다. 그리고 기존값을 반환한다.
     *  - getNode(index)를 통해 특정 위치에 있는 노드를 찾고, 단순히 그 노드에 있는 item 데이터를 변경한다.
     */
    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    /**
     * - Object get(int index)
     *  - 특정 위치에 있는 데이터를 반환한다.
     *  - getNode(index)를 통해 특정 위치에 있는 노드를 찾고, 해당 노드에 있는 값을 반환한다.
     */
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    /**
     * - int indexOf(Object o)
     *  - 데이터를 검색하고, 검색된 위치를 반환한다.
     *  - 모든 노드를 순회하면서 equals()를 사용해서 같은 데이터가 있는지 찾는다.
     */
    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
