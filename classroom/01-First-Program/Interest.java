// 3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest. 

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        System.out.println("Enter Principal Amt: ");
        Scanner input= new Scanner(System.in);
        int principal= input.nextInt();
        System.out.println("Enter Time in years: ");
        int time= input.nextInt();
        System.out.println("Enter Rate of Interest: ");
        float rate= input.nextFloat();
        input.close();
        float interest= principal * rate * time;
        System.out.println(interest);
    }
}
