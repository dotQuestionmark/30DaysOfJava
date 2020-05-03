package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));
		int[] subArray = Arrays.copyOfRange(array, 0, 2);// this function is used to create subarray from an aray that
															// already exists ND BELOW is the out put
		System.out.println(Arrays.toString(subArray));
//[1, 2, 3, 4]
		// [1, 2]
	}
}

