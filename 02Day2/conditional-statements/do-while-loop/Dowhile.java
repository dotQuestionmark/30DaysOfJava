package DAY2;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 0;
		do {// in this you first add to sum and then iterate while rest everything is same
			// as while
			// so if you change the statement and experiment yourself you will find how
			// while and do while are different
			sum++;
		} while (sum < number);
		System.out.println(sum);
	}
}

