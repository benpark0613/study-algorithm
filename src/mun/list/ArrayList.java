package mun.list;

public class ArrayList<E> implements ListInterface<E> {
    private E item[]; // 요소 저장 공간
    private int numItems; // 요소 갯수
    private static final int DEFAULT_CAPACITY = 64;
    
    public ArrayList() {
        item = (E[]) new Object[DEFAULT_CAPACITY];
        numItems = 0;
    }

    public ArrayList(int n) {
        item = (E[]) new Object[n];
        numItems = 0;
    }
    
    // 배열 리스트의 k번째 자리에 원소 x 삽입
    @Override
    public void add(int index, E x) {
        if (numItems >= item.length || index < 0 || index > numItems) {
            
        } else {
            for (int i = numItems - 1; i >= index; i--) {
                item[i + 1] = item[i];
            }
            item[index] = x;
            numItems++;
        }
    }

    // 배열 리스트의 맨 뒤에 원소 추가하기
    @Override
    public void append(E x) {
        if (numItems >= item.length) {
            
        } else {
            item[numItems++] = x;
        }
    }

    // 배열 리스트의 k번째 원소 삭제하기
    @Override
    public E remove(int index) {
        if (isEmpty() || index < 0 || index > numItems - 1) {
            return null;
        } else {
            E tmp = item[index];
            for (int i = index; i <= numItems - 2; i++) {
                item[i] = item[i + 1];
            }
            numItems--;
            return tmp;
        }
    }

    @Override
    public boolean removeItem(E x) {
        return false;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public void set(int i, E x) {

    }

    @Override
    public int indexOf(E x) {
        return 0;
    }

    @Override
    public int len() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
