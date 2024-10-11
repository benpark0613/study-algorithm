package algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {5, 1, 3, 6, 8};
        System.out.println("정렬 전 배열: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("정렬 후 배열: " + Arrays.toString(data));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // 배열을 반복하면서 인접한 요소 비교
        for (int i = 0; i < n - 1; i++) {
            // 마지막 i개의 요소는 이미 정렬되있으므로 제외한다.
            for (int j = 0; j < n - i - 1; j++) {
                // 인접한 두 요소를 비교하여 순서가 틀리면 교환
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
