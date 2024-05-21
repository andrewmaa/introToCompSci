package ten;
import java.util.*; // import Scanner and ArrayList class

public class problem2 {
    // union method
    public static ArrayList<Integer> union(ArrayList<Integer> list, ArrayList<Integer> list2) {
        
        // create new list to store list with unionized integers
        ArrayList<Integer> list3 = new ArrayList<>();


        // add new integers from first list
        for (int i = 0; i < list.size(); i++) {
            if (list3.contains(list.get(i)) == false) {
                list3.add(list.get(i));
            }
        }


        // add new integers from second list
        for (int j = 0; j < list2.size(); j++) {
            if (list3.contains(list2.get(j)) == false) {
                list3.add(list2.get(j));
            }
        }
        
        // return the new list
        return list3;
    }

    // test program
    public static void main(String[] args) {

        // create Scanner for taking input
        Scanner input = new Scanner(System.in);

        // create two ArrayLists
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // ask and take input of 5 integers for each ArrayList
        System.out.println("Enter 5 integers for first list: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        System.out.println("Enter 5 integers for second list: ");
        for (int j = 0; j < 5; j++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> unionList = union(list, list2);

        // print unionized list
        System.out.print("The unionized list is: ");
        for (int x = 0; x < unionList.size(); x++) {
            System.out.print(unionList.get(x) + " ");
        }

    }
}
