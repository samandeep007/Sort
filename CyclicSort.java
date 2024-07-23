import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] numbers = {5,2,1,4,3};
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

    //Kunal's way
    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

}
