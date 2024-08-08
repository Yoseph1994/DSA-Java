// 7. To calculate Fibonacci Series up to n numbers. 

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter Fibonacci Series number: ");
        int maxNum= input.nextInt();
        input.close();
        int firstTerm=0;
        int secondTerm=1;
        for (int i=0; i<=maxNum; i++){
            System.out.println(firstTerm);
            int nextTerm= firstTerm + secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
