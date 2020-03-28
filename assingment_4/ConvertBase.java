//Sam Ballard

package assingment_4;

public class ConvertBase {
	private char[] nums = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public String converter(long number, long base) {
		long divide = number/base;
		long remainder = number%base;
		if(divide == 0) {
			return Long.toString(remainder);
		} else {
			return converter(divide, base) + nums[(int)remainder];
		}
	}
}
