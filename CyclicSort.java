import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 1, 4, 3 };
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        // Iterate through the array
        while (i < arr.length) {
            // Check if the current element is at its correct position
            if (i == arr[i] - 1) {
                // If the element is in the correct position, move to the next index
                i++;
            } else {
                // Swap the current element with the element at its correct position
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Kunal's way
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    // Find the missing number:
    static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            // If the element is already at its correct position, or it's out of range, move
            // to the next index
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        // Check for the first missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return arr.length;
    }

    //Anticipated kunal's way of doing it
    static int findMissing(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[nums[i]];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
               i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(j != nums[j]){
                return j;
            }
        }

        return nums.length;

    }

    // Find all the disappeared elements in the array
    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        List<Integer> result = new ArrayList<>();

        while(i<arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for(int j = 0; j<arr.length; j++){
            if (arr[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;

    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
        return arr[arr.length-1];
    }


}
