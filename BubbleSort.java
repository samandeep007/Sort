import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] numbers = {3,1,5,4,2};
        bubbleSort(numbers);
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


    
}