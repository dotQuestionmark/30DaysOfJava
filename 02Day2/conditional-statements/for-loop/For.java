package DAY2;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int iteration = in.nextInt();
		int sum = 0;
		for (int i = 0; i < iteration; i++) {// the for loop will run the number of times depends on the input taken in
												// iteration variable EX if iteration is =2 the for loop will run two
												// times
			sum++;// every time for loop runs sum gets plus one if the loops runs 2 times the
					// value of the sum will be 2
		} // and finally i printed sum so that you can see the sum value
		System.out.println(sum);
	}
}

