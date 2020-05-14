package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		Mergesort ob = new Mergesort();// called the main class via object creation like we use to do in Scanner class 
// for ex Scanner in = new SCanner(System.in)
		ob.sort(array, 0, array.length - 1);
		print(array);
	}
	public static void merge(int array[], int big, int mid, int end) {
		int l = mid - big + 1;
		int r = end - mid;

		int LeftArray[] = new int[l];// created two array left array and right array as a sub array of our main array
		int RightArray[] = new int[r];

		for (int i = 0; i < l; ++i)
			LeftArray[i] = array[big + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = array[mid + 1 + j];

		int i = 0, j = 0;
		int k = big;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				array[k] = LeftArray[i];
				i++;
			} else {
				array[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			array[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			array[k] = RightArray[j];
			j++;
			k++;
		}
	}
	public static void sort(int array[], int big, int end) {
		if (big < end) {
			int mid = (big + end) / 2;
			sort(array, big, mid);
			sort(array, mid + 1, end);   // here we are sorting the array
			merge(array, big, mid, end);
		}

	}
	public static void print(int array[]) {
		System.out.println(Arrays.toString(array));// here we called the array class utility to print array
	}
}

