//Chandler Bankos 
//CMSCI 125 Project - DMV Dictionary - Dictionary
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary
{
	//Array of Word and Meaning Pair
	private WordPair[] dictionary;
	//Store length of dictionary
	private int length;
	
	//constructor
	public Dictionary(String filename) throws FileNotFoundException
	{
		/*
		 * The following code is similar to the code that we did for LoopFile Earlier in the year
		 */
		File wordFile = new File(filename);//setup file
		Scanner scan  = new Scanner(wordFile);//scan from file
		length = scan.nextInt();
		dictionary = new WordPair[length];
		int i = 0;
		while(scan.hasNextLine()) //reads the next line
		{
			String line = scan.nextLine();
			String words[] = line.split(":"); //stores each individual word the user enters.
			//Goes through those words and assigns them to new WordPair.
			//Trim gets rid of the extra white space following the word **New thing**
			if(words.length > 1)
				dictionary[i++] = new WordPair(words[0].trim(),words[1].trim());
		}
		
		//for(int j = 0; j< length; j++)
			//System.out.println(dictionary[j].getWord() + dictionary[j].getMeaning());
	}
	
	/*//default Constructor
	public Dictionary() throws FileNotFoundException
	{
		//reads words from the file words.txt and scans the file using the position counter.
		File wordFile = new File("words.txt");
		Scanner scan  = new Scanner(wordFile);
		length = scan.nextInt();
		dictionary = new WordPair[length];
		int i = 0;//position holder
		while(scan.hasNextLine())
		{
			String line = scan.nextLine();//scans the line for the words
			String words[] = line.split(":");//splits the words of the sentence to be identified by the file
			
			if(words.length > 1)
				//trim gets rid of the extra white space
				dictionary[i++] = new WordPair(words[0].trim(),words[1].trim());
		}
		
	}
	*/
	
	//pass a word to the dictionary and get its meaning
	//if the word exists if it doesn't it returns the word back.
	public String getMeaning(String word)
	{
		for(int i = 0; i< length; i++)
			if (word.equalsIgnoreCase(dictionary[i].getWord()))
				return dictionary[i].getMeaning();
		return word; 
	}
}