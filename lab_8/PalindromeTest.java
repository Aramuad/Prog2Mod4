//Sam Ballard

package lab_8;
import java.util.Scanner;
public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palindrome p = new Palindrome();
		System.out.println("Enter a word to check its palindromicity: ");
		String input = sc.nextLine();
		if(p.isPalindrome(input) == true) {
			System.out.println("Recieved \'" + input + "\' which is indeed a palindrome.");
		} else {
			System.out.println("Recieved \'" + input + "\' which is not a palindrome");
		}
		sc.close();
	}
}
