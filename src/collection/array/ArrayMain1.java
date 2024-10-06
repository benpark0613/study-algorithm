package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        // 배열 생성
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        // 인덱스 변경, 조회
        arr[2] = 10;
        System.out.println("arr[2] = " + arr[2]);

        // 검색
        int value = 13;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("검색 완료: " + value);
                break;
            }
        }
    }
}
