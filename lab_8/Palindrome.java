//Sam Ballard

package lab_8;

public class Palindrome {
	
	public boolean isPalindrome(String s) {
		boolean result = false;
		if (s.length() == 0 || s.length() == 1) {
			result = true;
		} else if(s.length() > 1) {
			if (s.charAt(0) == s.charAt(s.length()-1)) {
				return isPalindrome(s.substring(1, s.length()-1));
			} else {
				result = false;
			}
		}
		return result;
	}
}
