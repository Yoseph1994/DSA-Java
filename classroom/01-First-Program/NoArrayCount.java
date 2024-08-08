public class NoArrayCount {
public static void main(String[] args) {
        int num = 1773;
        int count = 0;
        int key=7;
        while (num>0) {
            int rem = num % 10;
            if(key == rem){
                count++;
            }
            num= num / 10;
        }
        System.out.println(count);
    }
}
