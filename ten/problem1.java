package ten;
import java.util.*; // import Scanner and ArrayList class

public class problem1 {

    // removeDuplicates method 
    public static void removeDuplicates(ArrayList<Integer> list) {
        
        // compares each integer with the other integers in the list
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    // removes the duplicate integer
                    list.remove(j);
                }
            }
        }
    }

    // test program
    public static void main(String[] args) {

        // create Scanner for taking input
        Scanner input = new Scanner(System.in);

        // create new ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // asks and takes input of 10 integers
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        // removes duplicates using the created method above
        removeDuplicates(list);

        // prints each integer in the final list 
        System.out.print("The distinct integers are: ");
        for (int x = 0; x < list.size(); x++) {
            System.out.print(list.get(x) + " ");
        }
    }
}
