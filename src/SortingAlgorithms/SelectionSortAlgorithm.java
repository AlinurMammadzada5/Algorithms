package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void selectionSort(int[] arr) {
        int operations =0;
        for(int i =0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                operations++;
                if(arr[j]<arr[minIndex]){
                    operations++;
                    minIndex = j;
                }
            }
            if(minIndex != i){
                operations++;
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Operations: " + operations);
    }
}
