public class MaxArrayItem {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 100, 50};
        int max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

   
}
