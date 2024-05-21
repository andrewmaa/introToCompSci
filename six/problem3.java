/*  
intro to computer science 
march 4, 2024
andrew ma
problem 3: sort students
*/

// import modules
import java.util.Scanner; // Scanner for reading input


public class problem3 {
	public static void main(String[] args) {

		// create scanner for input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students to be processed: ");
		int num = input.nextInt();
		
		String[] names = new String[num];
		int[] scores = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Enter student " + (i+1) + "'s name: ");
			input.nextLine();
			names[i] = input.nextLine();

			System.out.print("Enter student " + (i+1) + "'s score: ");
			scores[i] = input.nextInt();


		}

        // sort students based on their scores in decreasing order
        // using bubble sort algorithm
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    // swap scores
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        // printing students names+scores in descending order
        System.out.println();
        System.out.println("students scores (in decreasing order):");
		for (int student = 0; student < num; student++) {
			System.out.println(names[student] + " has a score of "+ scores[student]);

		}
	}
}