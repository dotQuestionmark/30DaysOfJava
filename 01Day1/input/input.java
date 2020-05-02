package DAY1;

import java.util.Scanner;
// And this is how we import the Scanner utility in our code

public class Input {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// In JAVA we have a Scanner class that allows us to take input and this is the
		// statement how we call it in our main class
		// So lets say i need you age , your name and your grades in 'double'
		int age = in.nextInt();// to take age from user we call .nextInt() function from our imported Scanner
								// class
		double grade = in.nextDouble();
		// And this function is used to take double input from user
		// String name = in.next();now for string we have two functions the first
		// function stops taking input as soon as you hit space
		String name = in.nextLine();// but this function takes space between two words as well thats why i used this
		// in my code
		if (name.isEmpty()) {// Bonus information if you take input like thid String after int java will Show
								// you error hit is almost written in this code try to find out why XD you rhome
								// work. so to remove that error we need to check that if from the first input
								// statement name does not take any value we need to store again a value in it
			name = in.nextLine();// and finally your code works
		}
		System.out.println("Your Age :" + age);
		System.out.println("Your name :" + name);
		System.out.println("Your grade :" + grade);
	}
}

