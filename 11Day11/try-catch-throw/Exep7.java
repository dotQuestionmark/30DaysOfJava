package DAY11;

import java.util.Scanner;

public class Exep7 {
	static void validate() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = in.nextInt();
		if (age < 18)
			throw new ArithmeticException("not valid, you are still under-age ");// Throw exception is used when you
																					// wanna check some conditions
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		validate();
	}
}

