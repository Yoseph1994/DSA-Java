class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 0;
        int result = searchFor(target, arr);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        } 
    }

    static int searchFor(int target, int[] arr) {    
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2; // Recalculate middle in each iteration

            if(target == arr[middle]) {
                return middle; // Return the index of the found element
            }

            if(target > arr[middle]) {
                start = middle + 1;
            } else if(target < arr[middle]) {
                end = middle - 1;
            }
        }

        return -1; 
    }
}
