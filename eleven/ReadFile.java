import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile
{

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		
		// get the file name
		System.out.print("Enter a file name: ");
		File file = new File (input.nextLine());
		
		// create a BufferedReader for the file
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		//read data from file
		String allFile = "";
		String line = ""; 
		
		while((line = br.readLine()) != null)
		{
			allFile = allFile +  line;	
			System.out.println(line);
		}
		
		//close the file
		br.close();
	}

}
