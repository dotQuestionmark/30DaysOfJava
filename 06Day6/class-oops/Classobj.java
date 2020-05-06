package DAY6;

import java.util.Scanner;

class demo {// created a demo class that holds a constructor that will take your name and
			// age and print them according to the printing statement.
	private String name;
	private int age;

	demo() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		name = in.nextLine();
		System.out.println("Enter your age");
		age = in.nextInt();
		System.out.println("Good morning :" + name + " you are :" + age + " this old");
	}
}

public class Classobj {
	public static void main(String[] args) {
		demo obj = new demo();
	}
}

