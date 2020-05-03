package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String test = in.nextLine();
		char array[] = test.toCharArray();// here i converted the string into char array
		System.out.println(Arrays.toString(array));// and if we print it for example the string was test so the result
													// would be [t, e, s, t]
	}
}

