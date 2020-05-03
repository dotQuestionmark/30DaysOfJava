package DAY3;

import java.util.Scanner;

public class Srting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String test = in.nextLine();// input test String
		String test1 = test.toLowerCase();// this function is used to convert all the characters in your test string to
											// lower case if any in upper case
		System.out.println(test1);// printing the lower cased string test1
		String test2 = test.toUpperCase();// this function is used to convert all of your lower cased characters if any
											// into upper case
		System.out.println(test2);// printing upper cased String
	}
}

