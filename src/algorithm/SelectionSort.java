package algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {1, 3, 2, 6, 4, 5};
        System.out.println("정렬 전 배열: " + Arrays.toString(data));
        selectionSort(data);
        System.out.println("정렬 후 배열: " + Arrays.toString(data));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        // 배열을 반복하면서 각 단계에서 최솟값을 찾음
        for (int i = 0; i < n - 1; i++) {
            int lowestNumberIndex = i;

            // i번째부터 배열의 끝까지 최솟값을 찾음
            for (int j = i +1; j < n; j++) {
                if (array[j] < array[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }

            // 최솟값이 현재 위치의 값과 다르면 교환
            if (lowestNumberIndex != i) {
                int temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }
    }
}
