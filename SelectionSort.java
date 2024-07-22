import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4,5,8,3,2,54,32,67,31,16};
        selectionSort(arr);
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

    // static void selectionSort(int[] arr) {
    //     // Outer loop to iterate over each element of the array
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         // Assume the minimum is the current index
    //         int minIndex = i;

    //         // Inner loop to find the minimum element in the unsorted part of the array
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[j] < arr[minIndex]) {
    //                 // Update minIndex if a smaller element is found
    //                 minIndex = j;
    //             }
    //         }

    //         // Swap the found minimum element with the first element of the unsorted part
    //         if (minIndex != i) { // Only swap if minIndex has changed
    //             int temp = arr[i];
    //             arr[i] = arr[minIndex];
    //             arr[minIndex] = temp;
    //         }

    //     }
    // }

  static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length - 1; i++){
            int maxIndex = 0;
            for(int j = 0; j < arr.length - i ; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
        }
  }





}
