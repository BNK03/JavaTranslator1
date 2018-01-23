import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
	
	//Array goes here
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String dmvWord;
		String engWord;
		int position = 0;
		File wordFile = new File("words.txt"); // set up file
		Scanner file = new Scanner(wordFile); // scan from file
		
		while (file.hasNext())// reads next int 
		{
			engWord = file.next(); 
			dmvWord = file.next();
			position++;
		}
		
		System.out.println("end");
	}



}
