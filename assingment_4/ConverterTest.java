//Sam Ballard

package assingment_4;
import java.util.Scanner;
public class ConverterTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConvertBase c = new ConvertBase();
		System.out.println("Enter a number to convert: ");
		long num = sc.nextLong();
		System.out.println("Enter the base to convert to: ");
		long base = sc.nextLong();
		System.out.println(num + " in decimal is " + c.converter(num, base) + " in base " + base);
		sc.close();
	}
}
