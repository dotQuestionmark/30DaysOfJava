package fibonacii;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci by loops");
		System.out.println("Enter two number to make a sequence");
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();

		System.out.println(number1);
		System.out.println(number2);

		for (int i = 0; i <= 15; i++) {
			int next = number1 + number2;
			number1 = number2;
			number2 = next;

			System.out.println(next);
		}

		System.out.println("");
		System.out.println("Fibonacci recursive solution with return value");

		System.out.println(0);
		for (int i = 0; i <= 15; i++) {
			System.out.println(RecursiveSolution(i));
		}
	}

	private static int RecursiveSolution(int n) {// method for recursive solution
		if (n <= 1)
			return 1;

		return RecursiveSolution(n - 2) + RecursiveSolution(n - 1);
	}

}

