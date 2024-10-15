package algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("정렬 전 배열: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("정렬 후 배열: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // key보다 큰 요소들을 한 칸씩 뒤로 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 올바른 위치에 key 삽입
            arr[j + 1] = key;
        }
    }

}
