//scanner


public class WordTranslate {
	
	private String dmvWord = "";
	private String engWord= "";
	
	
	public WordTranslate(String dmvWord, String engWord) {
		
		this.dmvWord = dmvWord;
		this.engWord = engWord;
	}


	public String getDmvWord() {
		return dmvWord;
	}


	public String getEngWord() {
		return engWord;
	}


	public void setDmvWord(String dmvWord) {
		this.dmvWord = dmvWord;
	}


	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}

	
}
