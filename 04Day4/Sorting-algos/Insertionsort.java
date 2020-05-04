package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// As usual called the scanner class
		int size = in.nextInt();// used the object created from the scanner class
		int array[] = new int[size];// initialized the array size
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();// taken values inside the array
		}
		sort(array);// this function will sort the array
		printarray(array);// this function will print the sorted array
	}
	public static void sort(int array[]) {
		for (int i = 0; i < array.length; ++i) {
			int key = array[i];
			int j = i - 1;

			// now here we are moving the elements one step ahead who are greater than key
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;// and finally we have our sorted array
		}
	}
	public static void printarray(int array[]) {
		System.out.println(Arrays.toString(array));// again here we called the array class utility
		// i personally believe that before going ahead you should master arrays and for
		// that you need to study some sorting algorithms thats why today we will only
		// learn about some sorting algorithms
	}
}
