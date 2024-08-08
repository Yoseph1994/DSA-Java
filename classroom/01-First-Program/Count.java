public class Count{
    public static void main(String[] args) {
     int arr[]={7,0,9,3,5,6,2,7,7};
     int key=0;
     int count=7;

     for(int i=0;i<=8;i++){
        if(arr[i]==key){
            count++;
        }
     }
     System.out.println(count);
    }
}