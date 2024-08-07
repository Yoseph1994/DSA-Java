// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions) 

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Insert ur First Number: ");
        float firstNumber= input.nextFloat();
        System.out.println("Insert ur First Number: ");
        float secondNumber= input.nextFloat();
        System.out.println("Insert Prefered Operator: ");
        String operator= input.next();
        input.close();
             if(operator.equals("+")) {
              System.out.println(firstNumber + secondNumber);
              return;
             } else if (operator.equals("-")){
                System.out.println(firstNumber - secondNumber);
                return;

             } else if (operator.equals("*")){
                System.out.println(firstNumber * secondNumber);
                return;

             } else if(operator.equals("/")){
                if (firstNumber == 0){
                    System.out.println("Cannot divide by zero");
                    return;
                }
                System.out.println(firstNumber / secondNumber);
                return;
        }

        System.out.println("Invalid Operator");
    }
}
