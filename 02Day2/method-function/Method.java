package DAY2;

import java.util.Scanner;

public class Method {// note in java we address functions as method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int age = in.nextInt();
		int sum = 0;
		type(age, name);// this method returns weather am in a kid teen adult or a senior citizen and this is the wat to call a function 
		System.out.println(sum(age, sum));// this returns the sum of the do while loop

	}

	public static int sum(int age, int sum) {// i passed age and sum into this function it is a int type function so it
												// requires return statement
		do {// in this you first add to sum and then iterate while rest everything is same
			// as while
			// so if you change the statement and experiment yourself you will find how
			// while and do while are different
			sum++;
		} while (sum < age);
		return sum;
	}

	public static void type(int age, String name)// i passed age and name in this function this is a void type of
													// function so it does not require a return statement
	{
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
}

