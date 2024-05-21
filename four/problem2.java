/*  
intro to computer science 
feb. 15, 2024
andrew ma
problem 2: display leap years
*/

public class problem2 {
	public static void main(String[] args) {

		// create accumulator variable
		int count = 0;

		// for loop to run testing every year
		for (int i = 101; i <= 2100; i++) {

			
			if (i % 4 == 0) {

				// if year is divisible by 4 and 400
                if (i % 100 == 0) {                    
                	if (i % 400 == 0) {

                		// prints year and adds 1 to the count of # of leap years
                        System.out.print(i + " ");
                        count += 1;

                        // prints new line after 10 leap years are printed
                      	if (count % 10 == 0) {
                      		System.out.println();
                      	}
                    }
                }        

                // similar process, but if the year is divisible by 4 and not divisible by 100        
                else {
                    System.out.print(i + " ");
                    count += 1;

                    if (count % 10 == 0) {
                      	System.out.println();
                    }
                }
            }
        }

        // print final # of leap years
        System.out.println();
		System.out.println("There are " + count + " leap years in the period of 101 to 2100.");
	}
}
