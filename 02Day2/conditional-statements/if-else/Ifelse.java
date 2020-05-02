package DAY2;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// called the scanner class through in object
		String name = in.nextLine();
		int age = in.nextInt();
		if (age < 18) {// checks if the age is smaller than 18 if it is print the statement under if
			System.out.println(name + " " + "is a kid");
		} else {// else print the statement under else
			System.out.println(name + " " + "is an adult");
		} // now what if we wanted we want to describe more like if you are a baby or a
			// kid or a teen or and adult or what if you are a senior citizen
			// for that check out the else-if document

	}
}

