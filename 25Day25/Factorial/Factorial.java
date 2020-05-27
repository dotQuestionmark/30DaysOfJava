package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number whoes factorial you want to calculate ");
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();
		System.out.println("The factorial of given number by Method1 is: " + n + " is " + Method1(n));
		System.out.println("The factorial of given number by Method2 is: " + n + " is " + Method2(n));
		System.out.println("The factorial of given number by Recursion is: " + n + " is " + Byrecursion(n));
	}

	private static int Byrecursion(int n) {// This method is used to find the factorial by the help of recursion
		if (n == 1)
			return 1;

		return n * Byrecursion(n - 1);
	}

	private static int Method2(int n) {// Method one to find a factorial of the given number
		int factorial = n;
		for (int i = 1; i < n; i++) {
			factorial *= i;
		}

		return factorial;
	}

	private static int Method1(int n) {// Method two find the factorial of the givaen number
		int factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}

		return factorial;
	}

}

