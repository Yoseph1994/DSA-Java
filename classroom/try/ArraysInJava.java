import java.util.ArrayList;
import java.util.Scanner;

public class ArraysInJava{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the array Numbers: ");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
           numbers[i]=input.nextInt();
        }
        input.close();
        
       for (int num : numbers) {
        System.out.println(num);
       }
    }
}