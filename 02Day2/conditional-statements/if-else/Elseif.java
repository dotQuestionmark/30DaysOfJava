package DAY2;

import java.util.Scanner;

public class Elseif {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int age = in.nextInt();
		if (age > 0 && age <= 12) { // now here i wanted to check the age two times if it statisfied both the times
									// then only i wanted to print that the user is a kid. So i used (&) which is
									// called and so if the age is greater then 0 and less then 12 or equal to 12 it
									// will print the user is a kid
			System.out.println(name + " " + "is a kid");
		} else if (age >= 13 && age < 18) {// same here if age is greater then 12 means from 13 to less then 18 means 17
											// (13-17) it will print the user is a teen
			System.out.println(name + " " + "is a teen");
		} else if (age >= 18 && age < 60) {// if the age is 18 or greater 18 and is less then 60 means (18-59) the user
											// is an adult
			System.out.println(name + " " + "is a adult");
		} else {// and else any age beyond 59 means from 60 till he/she dies he/she is a senior
				// citizen
			System.out.println(name + " " + "is a senior citizen");
		}
	}
}// your home work is to study about (or) i told you about (and) because this will be very help full for todays task

