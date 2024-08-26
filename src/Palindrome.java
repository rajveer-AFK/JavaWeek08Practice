import javax.swing.JOptionPane;
public class Palindrome {

	public static void main(String[] args) {
		
		String userPhrase = JOptionPane.showInputDialog(null, "Enter a phrase");
		
		StringBuilder unPuncuatedUserPhrase = new StringBuilder(removePhrasePuncuation(userPhrase));
		
		
	}
	
	public static StringBuilder removePhrasePuncuation(String phrase) {
		StringBuilder unPuncuatedPhrase = new StringBuilder();
		
		for(int chr = 0; chr < phrase.length(); chr++) {
			if(Character.isLetterOrDigit(phrase.charAt(chr))) {
				unPuncuatedPhrase.append(phrase.charAt(chr));
			}
		}
		
		return unPuncuatedPhrase;
	}
	
	public static void reversePhrase(StringBuilder phrase) {
		char temp;
		for(int firstChr = 0, lastChr = phrase.length() - 1; firstChr < lastChr; firstChr++, lastChr--) {
			temp = phrase.charAt(lastChr);
			phrase.setCharAt(lastChr, phrase.charAt(firstChr));
			phrase.setCharAt(firstChr, temp);
		}
	}
	
	public static boolean isPhraseAPalindrome(String phrase) {
		boolean isPalindrome = false;
		
		StringBuilder reversedUnPuncuatedPhrase = removePhrasePuncuation(phrase.toUpperCase());
		StringBuilder reversedUnPuncuatedPhrase2 = removePhrasePuncuation(phrase.toUpperCase());
		reversePhrase(reversedUnPuncuatedPhrase);
		
		if(reversedUnPuncuatedPhrase.toString().equals(reversedUnPuncuatedPhrase2.toString())) {
			isPalindrome = true;
		}
		
		return isPalindrome;
		
		
		
	}

}
