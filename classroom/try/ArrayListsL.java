import java.util.ArrayList;

public class ArrayListsL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MultiDimensional ArrayLists: ");

        ArrayList<ArrayList<Integer>> multiDList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            multiDList.add(new ArrayList<>());
        }

       for (int i = 0; i < 3; j++) {
           for (int k = 0; k < 3; k++) {
             multiDList.get(i).add(input.nextInt);
           }
       }

       System.out.println(multiDList);
    }
}
