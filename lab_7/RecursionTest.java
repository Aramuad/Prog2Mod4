package lab_7;
import java.util.Scanner;
public class RecursionTest {

	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to check the amount of vowels it contains: ");
		String userInput = sc.nextLine();
		System.out.println("Checking the number of vowels in \"" + userInput + "," + "\" which is: " + recursion.findVowels(userInput));
		sc.close();
	}
}
