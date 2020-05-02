package DAY2;

import java.util.Scanner;

public class Bonusifelse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int agrigate_score = in.nextInt();
		String result = agrigate_score > 75 ? "pass" : "fail"; // if you have to compare between only two you can use if
																// else in this way. So here i said result will be pass
																// if its greater then 75 or fail if less then 75
		// after you enter your score it will store pass or fail in result and this
		// output statement will print whatever is stored in result
		// your home work for this is to change the data types and store a value in int
		// for example (int x=y>23?3:4;)
		System.out.println("you are :" + result);
	}
}

