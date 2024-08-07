// 2. Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        System.out.println("Enter ur Name: ");
        Scanner input= new Scanner(System.in);
        String name=input.nextLine();
        input.close();
        System.out.println("Hey there," + " " + name);
    }
}
