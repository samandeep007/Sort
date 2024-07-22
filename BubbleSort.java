import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5};
        bubbleSort4(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    //My implementation
    static void bubbleSort(int[] arr){
        int start = 0;
        for(int i =0; i<arr.length; i++){
            while(start<arr.length-1){
                if(arr[start] > arr[start + 1]){
                    int temp = arr[start];
                    arr[start] = arr[start+1];
                    arr[start+1] = temp;
                }
                start++;
            }
            start = 0;
        }
    }

    //My implementation 2
    static void bubbleSort2(int[] arr){
        for(int i = 0; i <= arr.length; i++){
            int end = arr.length - 1;
            while(end >= i) {
                if(arr[i] > arr[end]) {
                    int temp = arr[i];
                    arr[i] = arr[end];
                    arr[end] = temp;
                }
                end--;
            }
        }
    }

    static void bubbleSort3(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void bubbleSort4(int[] arr) {
        // Outer loop to control the number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Initialize the swapped flag to false
            boolean swapped = false;
            // Inner loop for comparing elements
            for (int j = 1; j < arr.length - i; j++) {
                // If the current element is less than the previous element, swap them
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    // Set the swapped flag to true after a swap
                    swapped = true;
                }
            }
            // If no elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }







}