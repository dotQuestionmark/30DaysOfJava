package DAY8;

import java.util.Scanner;

interface test { // defining interface
	void square(int number); // method is by default abstract
}

class arithmetic implements test // implementing interface
{
	public int number;

	public void square(int number) // abstract method
	{
		System.out.println("Square of number is: " + number * number);
	}
}

class totest {
	arithmetic obj = new arithmetic();

	totest() // defining constructor
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = in.nextInt();

		obj.square(num);
	}
}

public class Inter1 {
	public static void main(String[] args) {
		totest obj1 = new totest();

	}
}

