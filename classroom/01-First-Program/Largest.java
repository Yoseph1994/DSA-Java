// 5. Take 2 numbers as input and print the largest number. 

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float firstNum= input.nextFloat();
        System.out.println("Enter Second Number: ");
        float secondNum= input.nextFloat();
        input.close();

        if( firstNum < secondNum){
            System.out.println("The Largest Number is: " + secondNum);
            return;
        } else if (firstNum == secondNum){
            System.out.println("Both Numbers are Equal.");
            return;
        }

        System.out.println("The Largest Number is: " + firstNum);
    }
}
