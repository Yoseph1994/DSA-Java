import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Multidimensional arrays: ");

        int[][] numbers = new int[3][3];
        for (int row = 0; row < numbers.length; row++) {
          for (int cols = 0; cols < numbers[row].length; cols++) {
            numbers[row][cols] = input.nextInt();
           } 
        }

        System.out.println("Printing the array: ");
        for (int row = 0; row < numbers.length; row++) {
          for (int cols = 0; cols < numbers[row].length; cols++) {
            System.out.print(numbers[row][cols] + " ");
          }
          System.out.println();
        }

    }
}
