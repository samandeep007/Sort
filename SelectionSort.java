import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4,5,8,3,2,54,32,67,31,16};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void selectionSort(int[] arr){
//        for(int i = 0; i<arr.length; i++){
//            int min = Integer.MAX_VALUE;
//            int minIndex = 0;
//            for(int j = i; j<arr.length; j++){
//                if(arr[j] < min){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = min;
//            arr[minIndex] = temp;
//        }
//    }
    static void selectionSort(int[] arr) {
        // Outer loop to iterate over each element of the array except the last one
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the maximum element is at the start of the unsorted portion
            int maxIndex = 0 ;

            // Inner loop to find the maximum element in the unsorted portion
            for (int j = 1; j < arr.length - i; j++) {
                // Update maxIndex if a larger element is found
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
          if(maxIndex != arr.length - i - 1) {
              int temp = arr[maxIndex];
              arr[maxIndex] = arr[arr.length - i - 1];
              arr[arr.length - i - 1] = temp;
          }
        }
    }


    // using the minimum approach

    static void selectionSort2(int[] arr) {
        // Outer loop to iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Assume the minimum element is at the current position i
            int minIndex = i;

            // Inner loop to find the minimum element in the remaining unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                // Update minIndex if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at the current position i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Kunal's way of doing this
    static void selection(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0,last);
            swap(arr, maxIndex, last);

        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[maxIndex] ){
                maxIndex = i;
            }
        }
        return maxIndex;
    }





}
