import java.util.Arrays;

public class SwapArrayValues {
    public static void main(String[] args) {
        int [] lists={10,23,4,19,263};
        System.out.println("array before swap: ");
        System.out.println(Arrays.toString(lists));
        System.out.println("array after swap: ");
        swap(lists, 0,3);
        System.out.println(Arrays.toString(lists));
    }

    static void swap(int [] lists, int idx1, int idx2){
        int temp= lists[idx1];
        lists[idx1]= lists[idx2];
        lists[idx2]= temp;
    }
}
