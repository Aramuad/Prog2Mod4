package lab_7;

public class Recursion {

	Recursion() {
	}
	
	public int findVowels(String phrase) {
		if(phrase.length() == 0) {
			return 0;
		} else if(phrase.charAt(phrase.length() - 1) == 'a'
				|| phrase.charAt(phrase.length() - 1) == 'e'
				|| phrase.charAt(phrase.length() - 1) == 'i'
				|| phrase.charAt(phrase.length() - 1) == 'o'
				|| phrase.charAt(phrase.length() - 1) == 'u') {
			return 1 + findVowels(phrase.substring(0, phrase.length() - 1));
		} else {
			return findVowels(phrase.substring(0, phrase.length() - 1));
		}
	}
}
