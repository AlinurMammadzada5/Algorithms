package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    static void bubbleSort(int[] arr) {
        int operations = 0;
      boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            operations++;
             flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                operations++;
                if (arr[j] > arr[j + 1]) {
                    operations++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Bubble Sort result: " + Arrays.toString(arr));
        System.out.println("Number of operations : " + operations);
    }
}
