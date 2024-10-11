package algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {1, 3, 2, 6, 4, 5};
        System.out.println("정렬 전 배열: " + Arrays.toString(data));
        selectionSort(data);
        System.out.println("정렬 후 배열: " + Arrays.toString(data));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
