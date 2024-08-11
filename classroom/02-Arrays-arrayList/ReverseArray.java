import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9};


        System.out.println("Before Swap:");
        System.out.println(Arrays.toString(arr));
        int start=0;
        int end=arr.length-1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println("After Swap:");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
