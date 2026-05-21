package BinarySearch;

public class BinarySearchAlgorithm {
    public static int findNumber(int[] numbers , int target){
        int low =0;
        int high = numbers.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(numbers[mid] == target){
                return mid;
            } else if(numbers[mid] > target){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,65,70,90};

        System.out.println(findNumber(nums,65));
    }
}
