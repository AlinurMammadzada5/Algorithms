package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void insertionSort(int[] arr) {
        int operations =0;
        for (int i = 1; i < arr.length; i++) {
            operations++;
           int temp = arr[i];

           int j = i-1;
           while(j>=0 && temp<arr[j]){
               operations++;
               arr[j+1] = arr[j];
               arr[j] = temp;
               j--;
           }
        }
        System.out.println("Insertion Sort operations: "+operations);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
