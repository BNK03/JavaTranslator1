//Chandler Bankos 
//CMSCI 125 Project - DMV Dictionary - Driver
import java.io.FileNotFoundException;
import java.util.Scanner;

//Driver class to check the methods of Dictionary and WordPair
public class Driver
{
	public static void main(String [] args) throws FileNotFoundException
	{
		//creating new dictionary using the file "words.txt"
		Dictionary myDict = new Dictionary("words.txt");
		
		//String line = "Alright I agree to exaggerate this friend party thing but don't make hype about being angry";
		// or you can input line
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in your sentence: ");		
		String line = scan.nextLine() ;
		// no special characters or this code
		// will not run.
		String [] words = line.split(" ");
		System.out.println("Given Line:");
		System.out.println(line);
		System.out.println();//spacing
		System.out.println();//spacing
		System.out.println("Translated Line: ");
		//For loop to go through each word of the sentence entered
		for(int i = 0; i< words.length; i++)
		{
			    //myDict = the dictionary 
				// getMeaning comes from WordPair
				//words represents each word of the sentence.
				//getMeaning will pull the words meaning from the txt file and match it to the word
				System.out.print(myDict.getMeaning(words[i]) + " ");
		}
		System.out.println();
	}

}