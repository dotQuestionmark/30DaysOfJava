package DAY3;

import java.util.Arrays;//imported array class 
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));// this is a inbuilt function in array class that helps us to print
													// the array in a clean manner EX:-[12, 32, 1]
	}
}

