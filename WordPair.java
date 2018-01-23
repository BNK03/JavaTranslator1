//Chandler Bankos
//CMSCI 125 Project - DMV Dictionary
//WordPair Class that contains two String Variables/Constructor/Setters&Getters
public class WordPair
{
	//Store the word
	private String word;
	//Store the meaning
	private String meaning;
	
	//Constructor
	public WordPair(String w, String m)
	{
		this.word = w;
		this.meaning = m;
	}
	//return the word stored in the object
	public String getWord()
	{
		return word;
	}
	
	//return the meaning stored in the object
	public String getMeaning()
	{
		return meaning;
	}
	//set the value of word of this object
	public void setWord(String w)
	{
		this.word = w;
	}
	
	//set the meaning of this object
	public void setMeaning(String m)
	{
		this.meaning = m;
	}
}