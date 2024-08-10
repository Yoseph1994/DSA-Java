import java.util.Scanner;

public class Prime {
    public static void main(String [] args){
       Scanner input= new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n=input.nextInt();
       input.close();

      System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
         if (n <= 1){
            return false;
         }
        int c=2;
        while(c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
