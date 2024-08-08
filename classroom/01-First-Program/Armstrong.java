import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int startNum=num;
        int digitNum=num;
        input.close();
        int ans=0;
        int count=0;
        
      while (digitNum > 0) {
        digitNum=digitNum/10;
        count++;
        
      }
     

        while(num > 0){
           int rem = num % 10;
           int poweredRem=(int) Math.pow(rem, count); 
           num = num / 10;
           ans= ans + poweredRem;
        }

        if(ans== startNum){
            System.out.println("Armstrong");
            return;
           } 
        System.out.println("Not Armstrong");
           

    }
}

