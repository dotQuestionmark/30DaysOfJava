package DAY3;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();// input a number that will define the size of our array
		int[] array = new int[size];// this is how you create array in java
		for (int i = 0; i < array.length; i++) {// we run for loop from 0 to the size of the array and use .length
												// function here .length function is used to find the size of an array
			array[i] = in.nextInt();// now in every for iteration we take a value and assign it to the respective
									// address of the array
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);// and here we print out that assigned values
		}
	}
}

