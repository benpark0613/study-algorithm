package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * - Deque(Double Ended Queue)
 *  양쪽 끝에서 요소를 추가하거나 제거할 수 있다.
 *  큐와 스택의 기능을 모두 포함하고 있는 유연한 자료구조형이다.
 *
 *  Deque의 대표적 구현체는 ArrayDeque, LinkedList가 있다.
 *  ArrayDeque의 성능이 더 빠르다.
 *
 *  Deque은 Stack과 Queue로 사용하기 위해 동일한 메서드 이름을 제공한다.
 *  (ex. push(), pop() / offer(), poll())
 */
public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(단순 조회)
        System.out.println("deque.peekFirst(): " + deque.peekFirst());
        System.out.println("deque.peekLast(): " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println(deque);
    }
}
