// 8. To find out whether the given String is Palindrome or not. 

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word= input.nextLine();
        input.close();
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
        if(reversed.equals(word)){
            System.out.println("Palindrome");
            return;
        }
       System.out.println("Not Palindrome");
       
       
    }
}
