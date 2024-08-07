// 6. Input currency in rupees and output in USD. 

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        System.out.println("Insert In Ruppes: ");
        float Rupees=Input.nextFloat();
        System.out.println(Rupees * 0.012 + "USD");
        Input.close();
    }
}
