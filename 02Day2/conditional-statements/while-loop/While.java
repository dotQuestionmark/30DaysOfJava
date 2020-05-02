package DAY2;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 0;
		while (sum < number) {// here i said run while till sum is less then number the user entered
			sum++;// every time while runs sum gets a plus one so that while does not enter in a
					// infinite loop
		}
		System.out.println(sum);// and here you can see as soon as the value of sum hit equal to number
		// sum<number statement becomes false and while loop is terminated
	}
}

