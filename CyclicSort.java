import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] numbers = {5,2,1,4,3};
        cyclicSort(numbers);
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

}
