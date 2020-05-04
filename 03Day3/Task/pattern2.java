package staircase;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int c = num - 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < c) {
					System.out.print(" ");
				} else {
					System.out.print("# ");
				} 
			}
			System.out.println(" ");
			c = c - 1;
		}
	}

}

