package DAY7;

import java.util.Scanner;

class demo {// here if you see i created a class and made a counstructor inside that takes a
			// number as ID
	public int ID;

	demo() {
		Scanner in = new Scanner(System.in);
		ID = in.nextInt();
	}
}

class demo1 extends demo {// now i created another class and made it inherit demo class and how i did this
							// is using extends key word yes extends keyword is used to make classes inherit
							// classes
	void error() {
		System.out.println(ID);
	}
}

public class err {
	public static void main(String[] args) {
		demo1 obj = new demo1();// here i created an object(obj) of demo1 class

		obj.error();// now with the help of obj i called demo1 counstructor but before that it runs
					// demo counstructor takes ID and then runs demo1 and prints the ID.
	}
}

