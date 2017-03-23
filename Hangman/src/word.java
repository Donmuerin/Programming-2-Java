import java.util.ArrayList;

public class word
{
	private String enteredWord;
	private ArrayList<Character> previousGuesses;
	private boolean[] guessedChar;
	
	public word(String newWord){
		enteredWord = newWord; 
		previousGuesses = new ArrayList<Character>();
		guessedChar = new boolean[newWord.length()];
		
	}
	
	public String getClue(){
		String clue = "";
		for(int i = 0; i < enteredWord.length(); i++){
			if(guessedChar[i] == true){
				clue += enteredWord.charAt(i);
			}
			else{
				clue += "*";
			}
		}
		return clue;
	}
	
	public String getWord() { 
		return enteredWord; 
	}
	
	public boolean checkCorrect(char guess){
		boolean isGuessCorrect = false;
		
		if(!previousGuesses.contains(new Character(guess))){
			if(enteredWord.indexOf(guess) > -1){
				isGuessCorrect = true;
				int startIndex = enteredWord.indexOf(guess);
				while(startIndex >= 0){
				guessedChar[startIndex] = true;
				startIndex = enteredWord.indexOf(guess, startIndex + 1);
				}
			}
		previousGuesses.add(new Character(guess));
		}
		return isGuessCorrect;
	}
	
	public boolean allCorrect(){
		for(int i = 0; i < guessedChar.length; i++){
			if(guessedChar[i] == false){
				return false;
			}
		}
		return true;
	}
	
	public String displayAll(){
		String guesses = "";
		for(int i = 0; i < previousGuesses.size(); i++){
			guesses += previousGuesses.get(i) + ", ";
		}
		return guesses;
	}
}