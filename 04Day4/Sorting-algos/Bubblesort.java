package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		sort(array);
		print(array);
	}
	public static void sort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap array[j+1] and array[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}
	public static void print(int array[]) {
		System.out.println(Arrays.toString(array));
	}

}
