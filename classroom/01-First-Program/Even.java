// 1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Even {
   public static void main(String[] args) {
     System.out.println("Please, Enter ur Number");
     Scanner input= new Scanner(System.in);
     int number= input.nextInt();
     input.close();
     if(number % 2 !=0){
      System.out.println("Odd Number");
      return;
     }

     System.out.println("Even Number");
   }
}
