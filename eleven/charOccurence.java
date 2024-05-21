package eleven;

// import File class and Scanner class
import java.io.*;
import java.util.Scanner;

public class charOccurence {
    public static void main(String[] args) { 
        
        // create new Scanner variable to take input
        Scanner input = new Scanner(System.in);

        // ask and take input of filename to read
        System.out.print("Enter a filename: ");
        String filename = input.next();

        // create File variable for the designated file
        File file = new File(filename);
        
        // if the file doesn't exist, prompt for a new filename to be designated
        while (file.exists() == false) {
            System.out.println("File " + file.getName() + " does not exist");
            System.out.println();
            System.out.print("Enter a filename: ");
            filename = input.next();

            file = new File(filename);
        }

        // read each line in text file
        String line = "";

        // creating int array for counting 26 letters in the alphabet
        int[] charCount = new int[26]; 

        // try to read the file and return an exception otherwise
        try {
            // create new bufferedreader to read file
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            // set line to the next line of text in the file
            while ((line = br.readLine()) != null) {

                // create array of characters
                char[] characters = line.toCharArray();
                for (int i = 0; i < characters.length; i++) {
                    char c = characters[i];

                    // if the character is a letter, add 1 to the attributing location in the integer array
                    if (Character.isLowerCase(c)) {
                        charCount[c - 'a']++;
                    }
                }
            }
        }

        // return an exception if file can't be read or can't be found
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException e) {
            System.out.print("Error Reading File");
        }

        // print # of occurences for each character
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) + ":" + charCount[i]);
        }
    }

}
